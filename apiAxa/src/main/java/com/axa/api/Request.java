package com.axa.api;


import java.util.List;

public class Request {

	private List<String> codInclProductos;
	private List<String> codExclProductos;
	private String estatusPoliza;
	private List<String> codInclEndosos;
	private List<String> codExclEndosos;
	private List<String> codInclComunicado;
	private List<String> codExclComunicado;
	private List<String> codigosDiag;
	private List<String> codigosDescrDiag;
	private List<String> codigosTrans;
	private List<String> codigosObserv;
	

	public String getEstatusPoliza() {
		return estatusPoliza;
	}
	public void setEstatusPoliza(String estatusPoliza) {
		this.estatusPoliza = estatusPoliza;
	}	
	public List<String> getCodInclProductos() {
		return codInclProductos;
	}
	public void setCodInclProductos(List<String> codInclProductos) {
		this.codInclProductos = codInclProductos;
	}
	public List<String> getCodExclProductos() {
		return codExclProductos;
	}
	public void setCodExclProductos(List<String> codExclProductos) {
		this.codExclProductos = codExclProductos;
	}
	public List<String> getCodInclEndosos() {
		return codInclEndosos;
	}
	public void setCodInclEndosos(List<String> codInclEndosos) {
		this.codInclEndosos = codInclEndosos;
	}
	public List<String> getCodExclEndosos() {
		return codExclEndosos;
	}
	public void setCodExclEndosos(List<String> codExclEndosos) {
		this.codExclEndosos = codExclEndosos;
	}
	public List<String> getCodInclComunicado() {
		return codInclComunicado;
	}
	public void setCodInclComunicado(List<String> codInclComunicado) {
		this.codInclComunicado = codInclComunicado;
	}
	public List<String> getCodExclComunicado() {
		return codExclComunicado;
	}
	public void setCodExclComunicado(List<String> codExclComunicado) {
		this.codExclComunicado = codExclComunicado;
	}
	public List<String> getCodigosDiag() {
		return codigosDiag;
	}
	public void setCodigosDiag(List<String> codigosDiag) {
		this.codigosDiag = codigosDiag;
	}
	public List<String> getCodigosDescrDiag() {
		return codigosDescrDiag;
	}
	public void setCodigosDescrDiag(List<String> codigosDescrDiag) {
		this.codigosDescrDiag = codigosDescrDiag;
	}
	public List<String> getCodigosTrans() {
		return codigosTrans;
	}
	public void setCodigosTrans(List<String> codigosTrans) {
		this.codigosTrans = codigosTrans;
	}
	public List<String> getCodigosObserv() {
		return codigosObserv;
	}
	public void setCodigosObserv(List<String> codigosObserv) {
		this.codigosObserv = codigosObserv;
	}

	
	
	/*@Override
	public String toString() {
		String auxSize = "nada" ;
		if(InclusionesProducto != null && InclusionesProducto.size() != 0) {
			auxSize=InclusionesProducto.size()+"";
		}
		return "Request [InclusionesProductoSize="+auxSize+",InclusionesProducto=" + InclusionesProducto + ", estatuspoliza=" + estatuspoliza + ", endosos=" + endosos
				+ ", comunicados=" + comunicados + ", codigosdiagnostico=" + codigosdiagnostico
				+ ", codigosdiagdescripcion=" + codigosdiagdescripcion + ", codigostranscripcion="
				+ codigostranscripcion + ", codigosobservaciones=" + codigosobservaciones + "]";
	}*/
	
	

}
