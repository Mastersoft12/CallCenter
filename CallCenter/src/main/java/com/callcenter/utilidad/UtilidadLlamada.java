/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.utilidad;

import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author faamarti
 */
public class UtilidadLlamada {

    public static  List<PeticionDTO> obtenerLLamadas() {
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
        listPeticion.add(new PeticionDTO("Elsa", LocalTime.now()));
        return listPeticion;
    }

}
