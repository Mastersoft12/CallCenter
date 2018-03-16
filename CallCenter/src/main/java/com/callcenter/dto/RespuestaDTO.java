package com.callcenter.dto;

import java.io.Serializable;

public class RespuestaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mensaje;
	
	private boolean atendido;
	
	public RespuestaDTO(){
		
	}

	public RespuestaDTO(String mensaje, boolean atendido) {
		this.mensaje = mensaje;
		this.atendido = atendido;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isAtendido() {
		return atendido;
	}

	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}
	
	
	

	
}
