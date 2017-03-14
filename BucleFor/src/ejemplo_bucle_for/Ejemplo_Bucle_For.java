package ejemplo_bucle_for;

public class Ejemplo_Bucle_For {

	public static void main(String[] args) {
		
		//propiedades
		int sumadorPares = 0;
		int sumadorImpares = 0;
		
		//bucle
		for (int a = 1 ; a <= 50 ; a++) {
			if (a % 2 == 0) {
				sumadorPares +=a;
			}else{
				sumadorImpares +=a;
			}
		}
		//imprimer
		System.out.println("La suma de los pares es: " + sumadorPares);
		System.out.println("La suma de los impares es: " + sumadorImpares);
		}

}
