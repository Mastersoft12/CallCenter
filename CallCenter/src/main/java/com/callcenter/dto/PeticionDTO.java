package com.callcenter.dto;

import java.time.LocalTime;

public class PeticionDTO {
	
	private String nombreCompletoCliente;
	
	private LocalTime fecha;
	
	public PeticionDTO(){
		
	}

	public PeticionDTO(String nombreCompletoCliente, LocalTime fecha) {
		this.nombreCompletoCliente = nombreCompletoCliente;
		this.fecha = fecha;
	}

	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}

	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}

	public LocalTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalTime fecha) {
		this.fecha = fecha;
	}
	
	

}
