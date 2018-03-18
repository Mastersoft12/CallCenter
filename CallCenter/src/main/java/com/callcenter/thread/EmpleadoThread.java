package com.callcenter.thread;

import java.util.concurrent.ExecutorService;

import org.apache.log4j.Logger;

import com.callcenter.utilidad.UtilidadMensaje;

public class EmpleadoThread extends Thread {
	
	private final Logger logger = Logger.getLogger(EmpleadoThread.class);

	private String tipoEmpleado;

	private String nombreCliente;
	
	private ExecutorService executor;
	
	@Override
    public void run() {
		try {
			logger.info(UtilidadMensaje.generarMensajeAtendido(nombreCliente, tipoEmpleado));
            Thread.sleep(5000 + (long)(Math.random() * ((10000 - 5000) + 1)));           
            logger.info(UtilidadMensaje.generarMensajeSalida(nombreCliente, tipoEmpleado));
            System.runFinalization();
        } catch (InterruptedException ex) {
            logger.error(ex);
            Thread.currentThread().interrupt();

        }
		
	}		

	public EmpleadoThread(String tipoEmpleado, String nombreCliente, ExecutorService executor) {
		super();
		this.tipoEmpleado = tipoEmpleado;
		this.nombreCliente = nombreCliente;
		this.executor = executor;
	}

	public synchronized String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public synchronized void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public synchronized String getNombreCliente() {
		return nombreCliente;
	}

	public synchronized void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public synchronized ExecutorService getExecutor() {
		return executor;
	}

	public synchronized void setExecutor(ExecutorService executor) {
		this.executor = executor;
	}
	

}
