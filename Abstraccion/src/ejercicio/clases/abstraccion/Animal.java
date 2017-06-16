package ejercicio.clases.abstraccion;
// clase Animal es una clase abstracta
public abstract class Animal {
	
	protected String nombre, raza, color, tamano;
	public Animal (String nombre, String raza, String color, String tamano)
	{
		//costructor
		this.nombre=nombre;
		this.raza=raza;
		this.color=color;
		this.tamano=tamano;
	}
	public void imprimeDatos()
	{
		System.out.println("El nombre es: "+nombre);
		System.out.println("La raza es: "+raza);
		System.out.println("El color es: "+color);
		System.out.println("El tamano es:"+tamano);
	}
	public abstract void imprimeInformacion()
}
