package org.foobarspam.KataNumerosRomanos.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroRomano {
	

	private String numero;

	public NumeroRomano(String numero) {
		this.numero = numero;
	}

	public int convertir() {
		int numeroDecimal = 0;
		Pattern p = Pattern.compile("C{3}");
		Matcher m = p.matcher(numero);
		if (m.find()){
			numero += SimbolosRomanos.C;
		}
		return numeroDecimal;
	}

}
