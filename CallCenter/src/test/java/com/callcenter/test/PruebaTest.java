/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.test;

import com.callcenter.dispatcher.Dispatcher;
import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;
import com.callcenter.utilidad.UtilidadLlamada;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author faamarti
 */
public class PruebaTest {
    
    @Test
    public void cuandoLleguenDiesClientesDebeAtender() {
         Dispatcher call = new Dispatcher(4, 3, 3);
         List<PeticionDTO> listPeticion = new ArrayList<>();
        RespuestaDTO respuesta = new RespuestaDTO();
        Supplier<List<PeticionDTO>> supplier = UtilidadLlamada::obtenerLLamadas;
        listPeticion = supplier.get();
        for (PeticionDTO peticion : listPeticion) {
            respuesta = call.dispatchCall(peticion);
        }
     //   doReturn(true).when(respuesta.isAtendido());
      //  when(respuesta.isAtendido()).thenReturn(true);
        Assert.assertThat(respuesta.isAtendido(), is(true));
        
    }
    
}
