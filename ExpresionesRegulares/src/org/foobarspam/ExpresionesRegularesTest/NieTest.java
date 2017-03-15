package org.foobarspam.ExpresionesRegularesTest;

import static org.junit.Assert.*;

import org.foobarspam.ExpresionesRegulares.Nie;
import org.junit.Test;

public class NieTest {
	Nie nie;
	@Test
	public void testtieneLetraCorrecta() {
		nie.setNumeroId("Y0422921B");
		equals(nie.tieneLetraCorrecta());
		}

}
