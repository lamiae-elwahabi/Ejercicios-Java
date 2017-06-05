package org.foobarspam.ordenArrayTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.foobarspam.ordenArray.OrdenArray;
import org.junit.Test;

public class OrdenArrayTest {

	@Test
	public void test_longitud() {
		int [] arraySimple = {1,1,1};
		OrdenArray prueba= new OrdenArray(arraySimple);
		assertEquals(3, prueba.longitudArray());
	}
   
	@Test
	public void test_ordenar_array() {
		int [] arraySimple = {2,3,1};
		int []  arrayOrdenado = {1,2,3};
		OrdenArray prueba= new OrdenArray(arraySimple);
		assertTrue(Arrays.equals(arrayOrdenado, prueba.ordenarArray(arraySimple)) );
	}
	 
	@Test
	public void test_ordenar_array_negativo() {
		int [] arraySimple = {2,3,1,-4,-6};
		int []  arrayOrdenado = {-6,-4,1,2,3};
		OrdenArray prueba= new OrdenArray(arraySimple);
		assertTrue(Arrays.equals(arrayOrdenado, prueba.ordenarArray(arraySimple)) );
	}

}
