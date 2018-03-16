package com.callcenter.utilidad;

import com.callcenter.dto.EmpleadosDTO;

public enum TipoEmpleadoEnum {

	OPERARDOR("Operador"), SUPERVISOR("Supervisor"), DIRECTOR("Director");

	private String empleado;

	private TipoEmpleadoEnum(String empleado) {
		this.empleado = empleado;
	}

	public static String asignarEmpleado(EmpleadosDTO empleados){
		String resultado = "";
		if(empleados.getCantidadEnUso() <= empleados.getCantidadOperador()){
			resultado = OPERARDOR.getEmpleado();
		}else if(empleados.getCantidadEnUso() <= (empleados.getCantidadSupervisor()+empleados.getCantidadOperador())){
			resultado = SUPERVISOR.getEmpleado();
		}else if(empleados.getCantidadEnUso() <= (empleados.getCantidadSupervisor()+empleados.getCantidadOperador()+empleados.getCantidadDirector())){
			resultado = DIRECTOR.getEmpleado();
		}
		return resultado;
	}

	public String getEmpleado() {
		return empleado;
	}


}
