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
	
	//Metodo para validar si la poliza esta cancelada por falta de pago
	public boolean cancelada(String EstatusPoliza) {
		EstatusPoliza = EstatusPoliza.toLowerCase();
		if (EstatusPoliza.compareTo("cancelada por falta de pago")==0){
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar si el diagnostico se encuentra dentro de las inclusiones del producto
	public boolean incluido(String codigoDiagnostico, List<String>inclusionesProducto, List<String>exclusionesProducto ) {
		boolean inclusiones = inclusionesProducto.contains(codigoDiagnostico);
		boolean exclusiones = exclusionesProducto.contains(codigoDiagnostico);
		if (inclusiones == true && exclusiones == false) {
			return true;
		}
		else {
			return false;
		}
	}
 	
	//Metodo para validar si el diagnostico se encuentra dentro de las inclusiones de los endosos
	public boolean endoso(String codigoDiagnostico, List<String>inclusionesEndoso, List<String>exclusionesEndoso) {
		boolean inclusiones = inclusionesEndoso.contains(codigoDiagnostico);
		boolean exclusiones = exclusionesEndoso.contains(codigoDiagnostico);		
		if (inclusiones == true && exclusiones == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar si el diagnostico se encuentra dentro de las inclusiones de los comunicados
	public boolean comunicado(String codigoDiagnostico, List<String>inclusionesComunicados, List<String>exclusionesComunicados) {
		boolean inclusiones = inclusionesComunicados.contains(codigoDiagnostico);
		boolean exclusiones = exclusionesComunicados.contains(codigoDiagnostico);		
		if (inclusiones == true && exclusiones == false) {
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
	
	//Metodo para validar que el diagnostico contiene mordedura de perro
	public boolean perro(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("mordedura de perro")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para validar que el diagnostico contiene mordedura de gato
	public boolean gato(String codigoDiagnostico) {
		codigoDiagnostico = codigoDiagnostico.toLowerCase();
		if(codigoDiagnostico.contains("mordedura de gato")) {
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
			List<Integer> conteo = new ArrayList<>(); //Lista para guardar contadores de repeticiones de Diagnosticos en la Transcripcion
			int contRep = 0; //Contador de repeticiones
			int numMayor=0; //Variable para determinar que contador aparecio mas veces
			int posicion=0; //Posición del arreglo de diagnosticos 
			
			for( int cont=0; cont < codigosDiag.size(); cont++ ) { //Ciclo para recorrer todos los codigos de diagnostico
				for ( int contTrn=0; contTrn < codigosTranscripcion.size(); contTrn ++ ) { //Ciclo para comparar todos los codigos de la transcripcion contra los codigos de diagnostico
					if(codigosTranscripcion.get(contTrn).toLowerCase().compareTo(codigosDiag.get(cont).toLowerCase())==0) { //Comparamos valores
						contRep = contRep + 1; //Asignamos valor a Contador de repeticiones
					}
				}			
				conteo.add(contRep); //Agregamos nuestro contador a nuestra lista de contadores
				contRep = 0; // Reiniciamos nuestro contador
			}
			
			for (int cont= 0; cont < conteo.size(); cont ++) { //Ciclo para validar cual es la posición del diagnostico que debemos tomar
				if(conteo.get(cont)>numMayor) {
					numMayor=conteo.get(cont);
					posicion = cont;
				}
			}
			String diagnostico = codigosDiag.get(posicion);
			String diagdesc = codigosDiagDescripcion.get(posicion);
			lista.add(diagnostico);
			lista.add(diagdesc);					
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
