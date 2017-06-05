package org.foobarspam.ordenArray;

import java.util.Arrays;

public class OrdenArray {
	//Propiedades
	private int [] array = {};
	//Constructores
	public OrdenArray(){
		
	}
	public OrdenArray(int [] array){
		this.array = array;
	}
	//getters
	public int [] getArray(){
		return this.array;
	}
	//Métodos
	public int longitudArray() {
		int longitud = 0;
		int[] array = getArray();
		for (int i=0; i<array.length; i++) {
			longitud += array[i];
		}
		return longitud;
	}
	public int [] ordenarArray(int [] array){
		int [] ordenado = getArray();
		 Arrays.sort(ordenado);
		 Arrays.toString(ordenado);
		return ordenado;
	}

}
