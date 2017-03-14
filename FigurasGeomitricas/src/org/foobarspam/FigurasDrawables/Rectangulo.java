package org.foobarspam.FigurasDrawables;

public class Rectangulo extends FiguraGeometrica implements Drawable{
	//propiedad privada
	private double altura 	= 0d;
	private double anchura 	= 0d;
	//constructor
	public Rectangulo(){
		super(); 
	}
		
	public Rectangulo(double altura, double anchura){
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(String nombre, double altura, double anchura){
		super(nombre);
		this.altura = altura;
		this.anchura = anchura;
	}
	//geteres y seters
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.altura = anchura;
	}
	
	@Override
	public double area() {
		return getAltura() * getAnchura();
	}

	@Override
	public void draw() {
		
		
	}

}