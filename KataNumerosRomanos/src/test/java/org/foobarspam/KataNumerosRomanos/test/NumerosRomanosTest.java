package org.foobarspam.KataNumerosRomanos.test;

import org.junit.Test;

import junit.framework.TestCase;

public class NumerosRomanosTest extends TestCase {
	
	@Test
	public void numeroRomano1Test() {
		String numero = "MDCCCLXXXVIII";
		NumeroRomano numeroRomano = new NumeroRomano(numero);
		assertEquals(300,numeroRomano.convertir());
	}

}
