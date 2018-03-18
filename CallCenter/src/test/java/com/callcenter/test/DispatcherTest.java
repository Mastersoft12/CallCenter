package com.callcenter.test;

import com.callcenter.dispatcher.Dispatcher;
import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;
import com.callcenter.utilidad.UtilidadLlamada;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class DispatcherTest {

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
        assertThat(respuesta.isAtendido(), is(true));
    }

   
}
