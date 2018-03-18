package com.callcenter.dispatcher;

import com.callcenter.dto.PeticionDTO;
import com.callcenter.dto.RespuestaDTO;

public interface IDispatcher {
	
	public RespuestaDTO dispatchCall(PeticionDTO peticionDTO);

}
