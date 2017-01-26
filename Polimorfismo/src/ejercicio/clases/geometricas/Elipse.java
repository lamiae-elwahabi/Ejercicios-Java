package ejercicio.clases.geometricas;

public class Elipse extends FiguraGeometrica {
	//propiedad privada

	private double Ejemenor 	= 0d;
	private double Ejemayor 	= 0d;
	private final double PI = Math.PI;
	
	public Elipse(){
		super(); 
	}
		
	public Elipse (double Ejemenor, double Ejemayor){
		super();
		this.Ejemenor = Ejemenor;
		this.Ejemayor = Ejemayor;
	}
	
	public Elipse(String nombre, double Ejemenor, double Ejemayor){
		super(nombre);
		this.Ejemenor = Ejemenor;
		this.Ejemayor = Ejemayor;
	}
	
	public double getEjemenor(){
		return this.Ejemenor;
	}
	
	public void setEjemenor(double Ejemenor){
		this.Ejemenor = Ejemenor;
	}
	
	public double getEjemayor(){
		return this.Ejemayor;
	}
	
	public void setEjemayor(double Ejemayor){
		this.Ejemayor = Ejemayor;
	}
	
	@Override
	public double area() {
		return PI * getEjemenor()  * getEjemayor();
	}

}