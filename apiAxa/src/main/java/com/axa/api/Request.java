package com.axa.api;

public class Request {
	private String Diagnostico ;
	private String Transcripcion ;
	private int EdadPersona ;
	private String InicioPoliza ;
	private String FinPoliza;
	private String EstatusPoliza ;
	private String PolizaProteccion;
	private String CartaCobertura;
	private String Producto;
	private String TipoReclamo;
	
	public String getDiagnostico() {
		return Diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		Diagnostico = diagnostico;
	}
	public String getTranscripcion() {
		return Transcripcion;
	}
	public void setTranscripcion(String transcripcion) {
		Transcripcion = transcripcion;
	}
	public int getEdadPersona() {
		return EdadPersona;
	}
	public void setEdadPersona(int edadPersona) {
		EdadPersona = edadPersona;
	}
	public String getInicioPoliza() {
		return InicioPoliza;
	}
	public void setInicioPoliza(String inicioPoliza) {
		InicioPoliza = inicioPoliza;
	}
	public String getFinPoliza() {
		return FinPoliza;
	}
	public void setFinPoliza(String finPoliza) {
		FinPoliza = finPoliza;
	}
	public String getEstatusPoliza() {
		return EstatusPoliza;
	}
	public void setEstatusPoliza(String estatusPoliza) {
		EstatusPoliza = estatusPoliza;
	}
	public String getPolizaProteccion() {
		return PolizaProteccion;
	}
	public void setPolizaProteccion(String polizaProteccion) {
		PolizaProteccion = polizaProteccion;
	}
	public String getCartaCobertura() {
		return CartaCobertura;
	}
	public void setCartaCobertura(String cartaCobertura) {
		CartaCobertura = cartaCobertura;
	}
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}
	public String getTipoReclamo() {
		return TipoReclamo;
	}
	public void setTipoReclamo(String tipoReclamo) {
		TipoReclamo = tipoReclamo;
	}
	
	
	/*private int edad;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}*/

}
