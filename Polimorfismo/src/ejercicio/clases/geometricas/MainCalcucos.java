package ejercicio.clases.geometricas;

import java.util.ArrayList;

public class MainCalcucos {

	public static void main(String[] args) {
		
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		
		// test constructores 
	
		Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 3, 4);
		figuras.add(rectanguloConstructorLocal);
		
		
		Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 3);
		figuras.add(cuadradoConstructorLocal);
		
		
		Elipse elipseConstructorLocal = new Elipse("elipse", 2 , 3);
		figuras.add(elipseConstructorLocal);
				
		
		Circulo circuloConstructorLocal = new Circulo("circulo", 8);
		figuras.add(circuloConstructorLocal);
		
		
		for (FiguraGeometrica figura : figuras){
			System.out.println("El area del " + figura.getNombre() + " es " + figura.area());
		}

	}

}