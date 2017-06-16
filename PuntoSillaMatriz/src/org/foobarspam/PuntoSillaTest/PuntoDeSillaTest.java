package org.foobarspam.PuntoSillaTest;

import static org.junit.Assert.*;


import org.junit.Test;
import org.foobarspam.PuntoSillaMatriz.*;

public class PuntoDeSillaTest {
	
	private Object silla;

	@Test
	public void recorrerMatrizTest() {
		int[][] matriz = {{1 ,2 ,4},
						   {3 ,0 ,1},
						  {7 ,8 ,9}};		 
						 		 	

		silla.set.Matriz(matriz);
		assertEquals(9,silla .recorrerMatriz());
		}
	
}