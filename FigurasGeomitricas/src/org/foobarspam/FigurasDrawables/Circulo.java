package org.foobarspam.FigurasDrawables;

public class Circulo extends FiguraGeometrica implements Drawable{
	
	//propiedad de la clase Circulo
	private double radio 	= 0d;
	private final double PI = Math.PI;

	// Sobrecarga de constructores: constructor de la superclase FiguraGeometrica
	public Circulo(){
		super(); 
	}
		
	public Circulo(double radio){
		super();
		this.radio = radio;
		
	}
	//Constructor
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
		
	}
	
	
	@Override
	public double area() {
		// math.pow(numero, potencia) = elevar un número a una potencia
		return PI * Math.pow(this.radio, 2) ;
	}

	@Override
	public void draw() {
		System.out.println("El circulo ha sido dibujado.");
	}
	
}
