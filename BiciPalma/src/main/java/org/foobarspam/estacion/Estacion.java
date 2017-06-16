package org.foobarspam.estacion;

import org.foobarspam.bicicleta.Bicicleta;

public class Estacion {
	//Propiedades
	private int id= 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	//Instanciar la clase Bicicleta, Duda inyectar la clase Bicicleta en las propiedades??
	private Bicicleta [] anclajes = new Bicicleta [numeroAnclajes];
	
	//Constructor por defecto
	public Estacion(){
		
	}
	//Constructor
	public Estacion(int id, String direccion, int numeroAnclajes) {
	
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
	}
	//Getters y Setters
	
	public int getId() {
		return id;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getNumeroAnclajes() {
		return numeroAnclajes;
	}
	public Bicicleta[] getAnclajes() {
		return anclajes;
	}
	//Metodos
	public void consultarEstacion(){
		//Metodo que imprime la informacion de la estacion
		System.out.println("Id: "+ getId());
		System.out.println("Direccion: "+ getDireccion());
		System.out.println("NumeroAnclajes: "+ getNumeroAnclajes());
		//System.out.println(getId()+" "+ getDireccion()+ " "+ getNumeroAnclajes());
	}
	public int anclajesLibres() {
		//Metodo que recorre el array anclajes y devuelve la cantidad de huecos disponibles
		int libres =0;
		for(Bicicleta bicicleta : getAnclajes()){
			if(bicicleta == null) {
				libres++;
			}
		}
		return libres;
	}
	public void consultarAnclajes(){
		//Metodo que recorre el ar
	}
	public void anclarBicicleta(Bicicleta bicicleta) {
		// TODO Auto-generated method stub
		
	}
}
	
		

