package ejercicio.clases.geometricas;


public abstract class FiguraGeometrica {
	//propiedades
	private String nombre;
	//constructor
	public FiguraGeometrica(){
		this.nombre = "undefined";
	};
		
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	};
	
	//geters y seters
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public abstract double area();

}