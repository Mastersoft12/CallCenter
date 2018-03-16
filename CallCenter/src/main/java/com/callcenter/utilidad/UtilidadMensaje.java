package com.callcenter.utilidad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilidadMensaje {
	
	public static final String MENSAJE_RESPUESTA = " Se termino de atender al cliente ? por el EMPLEADO a las  ";	
		
	private static final String FORMATO_FECHA = "yyyy-MM-dd HH:mm:ss";
	
	public static final String MENSAJE_ATENDIDO = " El cliente  ? fue atendido por el EMPLEADO a las  ";
	
	public static final String MENSAJE_INDISPONIBILIDAD = "Apreciado USUARIO, en el momento no tenemos disponibilidad, se puesto en espera y luego sera atendido.";
	
	public static final String ERROR_PROCESO = "Ocurrio un error en el proceso ";
	
	private UtilidadMensaje(){
	}
	
	/**
	 * Generar un mensaje de un cliente que ya fue atendido
	 * @param nombreCliente
	 * @param empleado
	 * @return
	 */
	public static String generarMensajeSalida(String nombreCliente, String empleado){
		return MENSAJE_RESPUESTA.replace("?", nombreCliente).replace("EMPLEADO", empleado) + generarFecha();
	}
	
	/**
	 * Generar un mensaje de un cliente atendido
	 * @param nombreCliente
	 * @param empleado
	 * @return
	 */
	public static String generarMensajeAtendido(String nombreCliente, String empleado){
		return MENSAJE_ATENDIDO.replace("?", nombreCliente).replace("EMPLEADO", empleado) + generarFecha();
	}
	
	/**
	 * Genera un mensaje de indisponibilidad de trabajadores
	 * @param nombreCliente
	 * @return
	 */
	public static String generarMensajeIndisponibilidad(String nombreCliente){
		return MENSAJE_INDISPONIBILIDAD.replace("USUARIO", nombreCliente);
	}
	
	/**
	 * Genera la fecha actual en formato yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String generarFecha(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMATO_FECHA);
		LocalDateTime now = LocalDateTime.now();
		return now.format(formatter);
	}

}
