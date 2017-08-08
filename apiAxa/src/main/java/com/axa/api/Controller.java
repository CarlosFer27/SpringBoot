package com.axa.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value= "/axa1", method = RequestMethod.POST)
	public Response mapRequest(@RequestBody Request request) {
		Response salida = new Response(); //Objeto para acceder a atributos de response
		CondicionesGenerales cg = new CondicionesGenerales(); //Atributo para obtener los metodos de Condiciones Generales
		List<String> diagnosticoYdescripcion = cg.determinaDiagnostico(request.getCodigosDiag(), request.getCodigosDescrDiag(), request.getCodigosTrans()); //Lista que contiene Codigo y Codigo con Descripcion
		String diagnostico = diagnosticoYdescripcion.get(0);//Codigo del diagnostico que utilizaremos para dictaminación
		String diagDescripcion = diagnosticoYdescripcion.get(1);//Diagnostico y Descripcion que mostraremos como salida


		salida.setDiagnostico(diagDescripcion); //Setea a la salida el diagnostico con su descripcion
		salida.setIncluido(cg.incluido(diagnostico, request.getCodInclProductos(),request.getCodExclProductos())); //Invoca metodo para validar si el diagnostico esta dentro de las inclusiones del producto
		salida.setEndoso(cg.endoso(diagnostico, request.getCodInclEndosos(), request.getCodExclEndosos()));
		salida.setEstatusPoliza(cg.validaPago(request.getEstatusPoliza()));
		salida.setCadera(cg.cadera(diagDescripcion));
		salida.setRodilla(cg.rodilla(diagDescripcion));
		salida.setComunicado(cg.comunicado(diagnostico, request.getCodInclComunicado(), request.getCodExclComunicado()));
		salida.setColumna(cg.columna(diagDescripcion));
		salida.setBlefaroplastia(cg.blefaroplastia(diagDescripcion));
		salida.setPstosisPalpebral(cg.pstosisPalpebral(diagDescripcion));
		salida.setDisfunsionErectil(cg.disfuncionErectil(diagDescripcion));
		salida.setPerro(cg.perro(diagDescripcion));
		salida.setGato(cg.gato(diagDescripcion));
		salida.setCancelada(cg.cancelada(request.getEstatusPoliza()));
		return salida;
	}	
	
}
