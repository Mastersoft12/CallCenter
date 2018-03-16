package com.callcenter.thread;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.callcenter.utilidad.UtilidadMensaje;

public class EmpleadoThread extends Thread {
	
	private final Logger logger = Logger.getLogger(EmpleadoThread.class);

	private String tipoEmpleado;

	private String nombreCliente;
	
	@Override
    public void run() {
		try {
			logger.info("Inicia atendiento a cliente: " + nombreCliente + " a las: "
					+ UtilidadMensaje.generarFecha());
            Thread.sleep(5000 + (long)(Math.random() * ((10000 - 5000) + 1)));           
            logger.info("El cliente: "+nombreCliente+ " se termino de atender a las: "+UtilidadMensaje.generarFecha());
        } catch (InterruptedException ex) {
            logger.error(ex);
        }
		
	}	

	public EmpleadoThread(String tipoEmpleado, String nombreCliente) {
		this.tipoEmpleado = tipoEmpleado;
		this.nombreCliente = nombreCliente;
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
	

}
