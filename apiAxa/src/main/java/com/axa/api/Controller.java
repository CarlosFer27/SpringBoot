package com.axa.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value= "/axa1", method = RequestMethod.POST)
	public Map<String,Boolean> mapRequest(@RequestBody Request request) {
		Map respuesta = new HashMap<String,Boolean>();//Respuesta de nuestro WS
		CondicionesGenerales cond = new CondicionesGenerales(); // Objeto para acceder a metodos de CG
		
		boolean pagado = cond.validaPago(request.getEstatusPoliza());
		respuesta.put("pagado", pagado);
		return respuesta ;
		/*if (request.getEdad() < 18) {
		return "Eres menor de edad";
		}
		else {
		return "Eres mayor de edad";
		}*/
		//return new ResponseEntity<Request>(request, HttpStatus.OK);
	}
	
	
}
