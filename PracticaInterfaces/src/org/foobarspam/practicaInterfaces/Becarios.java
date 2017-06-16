package org.foobarspam.practicaInterfaces;

public class Becarios extends Empleados implements Estudiantes {
	//propiedades
	String carrera = " ";
	int curso = 0;
	String departamento = " ";
	
	//constructor
	public Becarios(String nombre, String apellidos, double sueldo, String DNI,String carrera, int curso, String departamento) {
		super(nombre, apellidos, sueldo, DNI);
		this.carrera = carrera;
		this.curso = curso;
		this.departamento = departamento;
		}

	@Override
	public void Examenes() {
		System.out.println("Los examenes debido a las prácticas comenzaran el 20 de septiembre");
		
		
	}

	@Override
	public void Universidad() {
		if (this.departamento.compareTo("Informatica")==0){
			System.out.println("Universidad de Illes Baleares");
		}
		else if(this.departamento.compareTo("Recursos Humanos")==0){
			System.out.println("Universidad de de Madrid");
		}
		else{
			System.out.println("Universidad de de Tánger");
			
		}
		
		
	}

	@Override
	public double NotaMediaPracticas(double[] notas) {
	
		return 0;
	}
}


