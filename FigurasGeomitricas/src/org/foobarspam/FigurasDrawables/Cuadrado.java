package org.foobarspam.FigurasDrawables;

public class Cuadrado extends FiguraGeometrica implements Drawable{
	//propiedad de la clase Cuadrado
	private double lado = 0d;
	
	public Cuadrado(){
		super();
	}
	
	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	public double getlado(){
		return this.lado;
	}
	
	public void setlado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return getlado() * getlado();
	}

	@Override
	public void draw() {
		
		
	}
}