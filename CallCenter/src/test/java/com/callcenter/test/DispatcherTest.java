package com.callcenter.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

import org.junit.Test;

import com.callcenter.dispatcher.Dispatcher;
import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;

public class DispatcherTest {

	@Test
	public void cuandoLleguenDiesClientesDebeAtender() {
		List<PeticionDTO> listPeticion = new ArrayList<>();
		RespuestaDTO respuesta = new RespuestaDTO();
		Dispatcher call = new Dispatcher(4, 3, 3);
		listPeticion.add(new PeticionDTO("Fabio Martinez Torres", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Isabella", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Angela", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Alejandra", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Jose Rafael", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Jose", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Gladys", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Luisa", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Rafael", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Lina", LocalTime.now()));
		for(PeticionDTO peticion: listPeticion){
			respuesta = call.dispatchCall(peticion);
		}
		System.err.println();
		Assert.assertTrue(respuesta.isAtendido());
	}
	
	/*@Test
	public void cuandoLleguenMasDiesClientesNoDebeAtender() {
		List<PeticionDTO> listPeticion = new ArrayList<>();
		RespuestaDTO respuesta = new RespuestaDTO();
		Dispatcher call = new Dispatcher(4, 3, 3);
		listPeticion.add(new PeticionDTO("Fabio Martinez Torres", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Isabella", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Angela", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Alejandra", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Jose Rafael", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Jose", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Gladys", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Luisa", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Rafael", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Lina", LocalTime.now()));
		listPeticion.add(new PeticionDTO("Elsa", LocalTime.now()));
		for(PeticionDTO peticion: listPeticion){
			respuesta = call.dispatchCall(peticion);
		}
		System.err.println();
		Assert.assertFalse(respuesta.isAtendido());
	}*/

}
