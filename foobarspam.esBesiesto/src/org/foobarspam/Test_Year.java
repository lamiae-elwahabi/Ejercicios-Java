package org.foobarspam;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Year {
	

	// Casos test para anyos que son bisiestos 
	@Test
	public void acabdo_en_0() {
		Year year2040 = new Year (2040);
		assertEquals("Test any bisiesto acabado en 0" , true , year2040.esBisiesto());
	}

	@Test
	public void acabado_en_2() {
		Year year2012 = new Year (2012);
		assertEquals("Test any bisiesto acabado en 2" , true , year2012.esBisiesto());
	}
	
	@Test
	public void acabdo_en_4() {
		Year year2024 = new Year (2024);
		assertEquals("Test any bisiesto acabado en 4" , true , year2024.esBisiesto());
	}
	
	@Test 
	public void acabo_en_6() {
		Year year2036 = new Year (2036);
		assertEquals("Test any bisiesto acabdo en 6" , true , year2036.esBisiesto());
	}
	
	@Test 
	public void acabado_en_8() {
		Year year2028 = new Year (2028);
		assertEquals("Test any bisiesto acabado en 8", true , year2028.esBisiesto());
	}
	
	//Casos test para anyos que no son bisiestos
	@Test
	public void acabdo_en_3() {
		Year year2013 = new Year (2013);
		assertEquals("Test any bisiesto acabado en 3", false , year2013.esBisiesto());
	}
	
 	@Test
 	public void acabdo_en_5() {
 		Year year2015 = new Year (2015);
 		assertEquals("Test any bisiesto acabado en 5", false , year2015.esBisiesto());
 	}
 	
 	@Test
 	public void acabdo_en_7() {
 		Year year2017 = new Year (2017);
 		assertEquals("Test any bisiesto acabado en 7", false , year2017.esBisiesto());
 	}
}
 	
	


