package BiciPalma;

public class Bicicleta {
 

	//Propiedades de la clase 
	
	private int id = 0;
	
	//Constructores de la clase 
	
	public Bicicleta(){
	}
	
	public Bicicleta(int id){
		this.id = id;
	}
	
	//Getters y setters
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
			this.id = id;
	}
}
