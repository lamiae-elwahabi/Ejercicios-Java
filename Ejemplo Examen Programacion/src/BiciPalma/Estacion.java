package BiciPalma;

public class Estacion {
	
	//Propiedades de la clase
	
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes;
	
	//Constructor de la clase 
	
	Public Estacion(int id, String direccion, int anclaje)
			this.id = id;
			this.direccion = direccion;
			this.numeroAnclajes = anclaje;
			this.anclajes = new Bicicleta[anclaje];
}
