package org.foobarspam.PuntoSillaMatriz;

public class PuntoDeSilla {
	//propiedades
	private int[][] matriz = new int[3][3];
	private int[] puntoDeSilla = new int[2];
	
	public PuntoDeSilla(int[][] matriz){
		this.matriz = matriz;
	}
	//constructores
	public PuntoDeSilla(){
		
	}
	
	public void setMatriz(int[][] matriz){
		this.matriz = matriz;
	}
	public int[][] getMatriz(){
		return this.matriz;
	}
	public int[] getPuntoDeSilla(){
		return this.puntoDeSilla;
	}
	public void setPuntoDeSilla(int fila, int columna){
		this.puntoDeSilla[0] = fila;
		this.puntoDeSilla[1] = columna;
	}
	
	public int recorrerMatriz(){
		int contador = 0;
		for (int fila = 0; fila < getMatriz()[0].length; fila++){
			for (int columna = 0; columna <getMatriz().length; columna++){
				contador += 1;
			}
		}
		return contador;
	}
}