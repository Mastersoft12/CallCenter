/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.utilidad;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.callcenter.dto.PeticionDTO;

/**
 *
 * @author faamarti
 */
public class UtilidadLlamada {
    /**
     * Genera la data para realizar pruebas
     * @return
     */
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
        return listPeticion;
    }

}
