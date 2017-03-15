package org.foobarspam.ExpresionesRegularesTest;

import static org.junit.Assert.*;

import org.foobarspam.ExpresionesRegulares.Dni;
import org.junit.Test;

public class DniTest {
	Dni dni;

	
	@Test
	public void tieneFormatoValidoTestAutomatico() {
		String[] dnisValidos = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		for (String numDni : dnisValidos) {
			Dni dni = new Dni(numDni);
			equals(dni.tieneFormatoValido());
		}
	
		
	}
}
