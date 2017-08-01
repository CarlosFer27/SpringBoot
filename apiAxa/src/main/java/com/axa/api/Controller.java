package com.axa.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value= "/axa1", method = RequestMethod.POST)
	public ResponseEntity<Request> validaEdad(@RequestBody Request request) {
		
		/*if (request.getEdad() < 18) {
			return "Eres menor de edad";
		}
		else {
			return "Eres mayor de edad";
		}*/
		return new ResponseEntity<Request>(request, HttpStatus.OK);
		//return new ResponseEntity<Request>(request, HttpStatus.OK);
	}
	
	
}
