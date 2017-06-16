package ejercicio.clases.abstraccion;

public class Gato extends Animal {
	
	private final String marca_arena;
	public Gato(String nombre, String raza, String color, String tamano,String marca_arena)
	{
		super(nombre, raza, color, tamano);
		this.marca_arena=marca_arena;
	}
	
	@Override
	public void imprimeInformation()
	{
		System.out.println("Soy un gato y mi marca favorita de arena es); "+marca_arena);
		
	}
	
}
