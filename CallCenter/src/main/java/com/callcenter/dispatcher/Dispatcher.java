package com.callcenter.dispatcher;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.callcenter.dto.EmpleadosDTO;
import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;
import com.callcenter.thread.EmpleadoThread;
import com.callcenter.utilidad.TipoEmpleadoEnum;
import com.callcenter.utilidad.UtilidadMensaje;

public class Dispatcher {

	private final Logger log = Logger.getLogger(Dispatcher.class);

	private int cantidadDirector;

	private int cantidadOperador;

	private int cantidadSupervisor;

	private ExecutorService executor;
	

	/**
	 * 
	 * @param peticionDTO
	 * @return
	 */
	public RespuestaDTO dispatchCall(PeticionDTO peticionDTO) {
		iniciarVariables();
		RespuestaDTO respuesta = new RespuestaDTO();
		try {
			int empleadosOcupados = buscarEmpleadosOcupados();
			System.err.println("Empleados:"+empleadosOcupados);
			if (validadDisponibilidadEmpleado(empleadosOcupados)) {
				respuesta = asignarEmpladoPeticion(peticionDTO, empleadosOcupados);
			} else {
				log.info(UtilidadMensaje.generarMensajeIndisponibilidad(peticionDTO.getNombreCompletoCliente()));
				respuesta = new RespuestaDTO(
						UtilidadMensaje.generarMensajeIndisponibilidad(peticionDTO.getNombreCompletoCliente()), false);
				asignarEmpladoPeticion(peticionDTO, empleadosOcupados);
			}
		} catch (Exception e) {
			log.error(UtilidadMensaje.ERROR_PROCESO);
		}
		return respuesta;

	}

	public Dispatcher(int cantidadDirector, int cantidadOperador, int cantidadSupervisor) {
		this.cantidadDirector = cantidadDirector;
		this.cantidadOperador = cantidadOperador;
		this.cantidadSupervisor = cantidadSupervisor;
		this.executor = Executors.newFixedThreadPool(cantidadDirector + cantidadOperador + cantidadSupervisor);
	}

	/**
	 * Se asigna un hilo para atender la peticion
	 * 
	 * @param peticionDTO
	 * @param empleadosOcupados
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	private RespuestaDTO asignarEmpladoPeticion(PeticionDTO peticionDTO, int empleadosOcupados) {
		String empleado = TipoEmpleadoEnum.asignarEmpleado(
				new EmpleadosDTO(empleadosOcupados, cantidadDirector, cantidadOperador, cantidadSupervisor));
		EmpleadoThread empleadoThread = new EmpleadoThread(empleado, peticionDTO.getNombreCompletoCliente());
		executor.submit(empleadoThread);
		return new RespuestaDTO(
				UtilidadMensaje.generarMensajeAtendido(peticionDTO.getNombreCompletoCliente(), empleado), true);
	}

	/**
	 * valida si existe un empleado que pueda atender al cliente
	 * 
	 * @param empleadosOcupados
	 * @return
	 */
	private boolean validadDisponibilidadEmpleado(int empleadosOcupados) {
		return empleadosOcupados <= (cantidadEmpleados());

	}

	/**
	 * regresa la cantidad empleados de empleados ocupados
	 * 
	 * @return
	 */
	private int buscarEmpleadosOcupados() {
		return EmpleadoThread.activeCount()-1;
	}

	public void iniciarVariables() {
		if (null == this.executor) {
			this.executor = Executors.newFixedThreadPool(cantidadEmpleados());
		}
	}

	public int getCantidadDirector() {
		return cantidadDirector;
	}

	public void setCantidadDirector(int cantidadDirector) {
		this.cantidadDirector = cantidadDirector;
	}

	public int getCantidadOperador() {
		return cantidadOperador;
	}

	public void setCantidadOperador(int cantidadOperador) {
		this.cantidadOperador = cantidadOperador;
	}

	public int getCantidadSupervisor() {
		return cantidadSupervisor;
	}

	public void setCantidadSupervisor(int cantidadSupervisor) {
		this.cantidadSupervisor = cantidadSupervisor;
	}

	public ExecutorService getExecutor() {
		return executor;
	}

	public void setExecutor(ExecutorService executor) {
		this.executor = executor;
	}

	public int cantidadEmpleados() {
		return cantidadDirector + cantidadOperador + cantidadSupervisor;
	}

}
