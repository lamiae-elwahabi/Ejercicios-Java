package org.foobarspam.ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDNI {

	public boolean CheckDNI(String dni){
		String exRegular = "\\b(\\d{8})([^IÑOUa-z\\d])\\b";
		
		Pattern patron = Pattern.compile(exRegular);
		Matcher coincidencia = patron.matcher(dni);
		
		if (coincidencia.find()){
			return true;
		}
		else {
			return false;
		}
	
	}

}



