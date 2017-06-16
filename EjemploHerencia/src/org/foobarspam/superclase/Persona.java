package org.foobarspam.superclase;
//Código de la clase Persona 
public class Persona {
		//Propiedades
		private String nombre;
		private String apellidos;
		private int edad;
		
		//Constructor
		public Persona (String nombre, String apellidos, int edad) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;  
			}
		//Getters
		public String getNombre () { return nombre;  }
		public String getApellidos () { return apellidos;  }
		public int getEdad () { return edad;   }
	
} //Cierre de la clase


