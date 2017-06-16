package org.foobarspam.ExpresionesRegulares;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dni extends DocIdentidad{


	public boolean CheckDNI(String dni){
		String exRegular = "\\b(\\d{8})([^I�OUa-z\\d])\\b";
		
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
