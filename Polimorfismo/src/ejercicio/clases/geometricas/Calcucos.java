package ejercicio.clases.geometricas;

import java.util.ArrayList;

public class Calcucos {

	public static void main(String[] args) {
		
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
	
		Rectangulo rectanguloConstructorLocal = new Rectangulo("rectángulo", 3, 4);
		
		figuras.add(rectanguloConstructorLocal);
		
		Cuadrado cuadradoConstructorLocal = new Cuadrado("cuadrado", 3);

		figuras.add(cuadradoConstructorLocal);
		
		Elipse elipseConstructorLocal = new Elipse("elipse", 3);

		figuras.add(cuadradoConstructorLocal);
				
		for (FiguraGeometrica figura : figuras){
			System.out.println("El area del " + figura.getNombre() + " es " + figura.area());
		}

	}

}