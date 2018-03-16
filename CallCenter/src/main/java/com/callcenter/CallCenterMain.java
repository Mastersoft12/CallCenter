package com.callcenter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;

import com.callcenter.dispatcher.Dispatcher;
import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;

public class CallCenterMain {

	public static void main(String[] args) {
		RespuestaDTO respuesta = new RespuestaDTO();
	    BasicConfigurator.configure();
		List<PeticionDTO> listPeticion = new ArrayList<>();
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

		Dispatcher call = new Dispatcher(4, 3, 3);

		for(PeticionDTO peticion: listPeticion){
			call.dispatchCall(peticion);
		}

	}

}
