package org.foobarspam.arnoldEnumType.test;

import static org.junit.Assert.*;

import org.foobarspam.arnoldEnumType.logica.Planeta;
import org.junit.Test;

public class ArnoldEnumTypeTest {


	@Test
	public void PlanetaConstructorTest() {
		// voy a asegurarme de que los metodos de los Enum Types
		// se comportan como yo espero
		Planeta planeta = Planeta.MERCURY;
		assertThat(planeta).isInstanceOf(Planeta.class);
		assertThat(planeta.ordinal()).isEqualTo(0);
		assertThat(planeta.name()).isEqualToIgnoringWhitespace("MERCURY");
		assertThat(Planeta.valueOf(planeta.name())).isEqualTo(Planeta.MERCURY);
		assertThat(planeta.compareTo(planeta.MERCURY)).isEqualTo(0);
		assertThat(planeta.toString()).isEqualToIgnoringWhitespace("MERCURY");
		assertThat(planeta.equals(planeta.MERCURY)).isEqualTo(true);
		assertThat(Planeta.values()[0]).isEqualTo(planeta);
	}
	

}
