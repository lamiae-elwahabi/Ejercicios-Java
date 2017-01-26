package ejercicio.clases.geometricas;

public class Circulo extends FiguraGeometrica {
	
	//propiedad privada
	private double radio 	= 0d;
	private final double PI = Math.PI;

	
	public Circulo(){
		super(); 
	}
		
	public Circulo(double radio){
		super();
		this.radio = radio;
		
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
		
	}
	
	
	@Override
	public double area() {
		// math.pow(numero, potencia) = elevar un número a una potencia
		return PI * Math.pow(this.radio, 2) ;
	}
}
