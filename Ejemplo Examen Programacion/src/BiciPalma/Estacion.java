package BiciPalma;

public class Estacion {
	
	//Propiedades de la clase
	
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private int[] anclajes;
	
	//Constructores de la clase 
	
	public Estacion(){
	}
	
	public Estacion(int id, String direccion, int numeroAnclajes){
			this.id = id;
			this.direccion = direccion;
			this.numeroAnclajes = numeroAnclajes;
			this.anclajes = new int[numeroAnclajes];
			
}
	
	//Getters y setteres 
	public int getId(){
			return this.id;
	}
	public void setId(int id){
			this.id = id;
	}
	public String getDireccion(){
			return this.direccion;
	}
	public void setDireccion(String direccion){
			this.direccion =  direccion;
	}
	public int getNumeroAnclajes(){
			return this.numeroAnclajes;
	}
	public void setNumeroAnclajes(int numeroAnclajes){
			this.numeroAnclajes = numeroAnclajes;
	}
	public int[] getAnclajes(){
			return this.anclajes;
	}
	
	// Metodos de la clase 
	
	public void consultarEstacion() {
	/*
	 * M�todo que imprime la informaci�n de la estaci�n
	 */
	System.out.println("Id: " + getId());
	System.out.println("Direccion: " + getDireccion());
	System.out.println("Numero anclajes: " + getNumeroAnclajes());
}

}