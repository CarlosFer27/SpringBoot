package com.axa.api;

import java.util.ArrayList;
import java.util.List;

public class CondicionesGenerales {
	
	//Metodo para validar si la poliza esta pagada
	public boolean validaPago(String EstatusPoliza) {
		EstatusPoliza = EstatusPoliza.toLowerCase();
		if (EstatusPoliza.compareTo("pagada")==0 || EstatusPoliza.compareTo("pagada con rehabilitación")==0){
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar si el diagnostico se encuentra dentro de las inclusiones del producto
	public boolean incluido(String codigoDiagnostico, List<String>inclusionesProducto) {
		if (inclusionesProducto.contains(codigoDiagnostico)) {
			return true;
		}
		else {
			return false;
		}
	}
 	
	//Metodo para validar si el diagnostico se encuentra dentro de las inclusiones de los endosos
	public boolean endoso(String codigoDiagnostico, List<String>inclusionesEndoso) {
		if (inclusionesEndoso.contains(codigoDiagnostico)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar si el diagnostico se encuentra dentro de las inclusiones de los comunicados
	public boolean comunicado(String codigoDiagnostico, List<String>inclusionesComunicados) {
		if (inclusionesComunicados.contains(codigoDiagnostico)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar que el diagnostico sea cadera
	public boolean cadera(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("cadera")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar que el diagnostico sea RODILLA
	public boolean rodilla(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("rodilla")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar que el diagnostico sea columna
	public boolean columna(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("columna")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//Metodo para validar que el diagnostico sea Blefaroplastia
	public boolean blefaroplastia(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("blefaroplastia")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar que el diagnostico sea Pstosis palpebral
	public boolean pstosisPalpebral(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("pstosis palpebral")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar que el diagnostico sea disfuncion erectil
	public boolean disfuncionErectil(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("disfuncion erectil")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para determinar que diagnostico vamos a dictaminar
	public List<String> determinaDiagnostico(List<String>codigosDiag,List<String>codigosDiagDescripcion,List<String>codigosTranscripcion) {
		List<String> lista = new ArrayList<>() ;
		if (codigosDiag.size()>= 2) {
			//Logica para contador y regresar un solo diagnostico
			return lista;
		}
		else {
			String diagnostico = codigosDiag.get(0);
			String diagdesc = codigosDiagDescripcion.get(0);
			lista.add(diagnostico);
			lista.add(diagdesc);
			return lista;
		}
		
	}
	

}
