package ejercicio.clases.abstraccion;

public class Abstraccion {

	public static void main(String[] args) 
	{
		
		//Declaramos un objeto de la clase Perro y usamos sus métodos (Heredado y Abstracto).
		Perro p=new Perro("Firulais","Pastor Aleman", "Cafe","Grande", "El perro feliz");
		p.imprimeDatos();
		p.imprimeInformation();
		
		//Declaramos un objeto de clase Gato y usamos sus métodos (Heredado y Abstracto).
		Gato g=new Gato("Bolita de Nieve","Persa", "Blanco","Peque","Pulcrogato");
		g.imprimeDatos();
		p.imprimeInformation();

	}

}
