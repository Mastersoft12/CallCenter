package com.callcenter.dto;

import java.io.Serializable;

public class EmpleadosDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int cantidadEnUso;
	
	private int cantidadDirector;

	private int cantidadOperador;

	private int cantidadSupervisor;
	
	

	public EmpleadosDTO(int cantidadEnUso, int cantidadDirector, int cantidadOperador, int cantidadSupervisor) {
		this.cantidadEnUso = cantidadEnUso;
		this.cantidadDirector = cantidadDirector;
		this.cantidadOperador = cantidadOperador;
		this.cantidadSupervisor = cantidadSupervisor;
	}

	public int getCantidadEnUso() {
		return cantidadEnUso;
	}

	public void setCantidadEnUso(int cantidadEnUso) {
		this.cantidadEnUso = cantidadEnUso;
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
	
	

}
