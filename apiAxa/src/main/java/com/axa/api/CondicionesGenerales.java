package com.axa.api;

public class CondicionesGenerales {
	
	
	public boolean validaPago(String EstatusPoliza) {
		if (EstatusPoliza == "Pagada" || EstatusPoliza =="Pagada con reabilitacion"|| EstatusPoliza == null){
			return true;
		}
		else {
			return false;
		}
	}

}
