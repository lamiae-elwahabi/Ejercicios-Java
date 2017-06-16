package practica.ejercicios.libros;

public class People {
	private String name;
	private String gender;
	
	Public Person(String initialName, String initialGender) {
			name = initialName;
			gender = initialGender;
			
	}
	Public String getName() {
		return name;
	}
	
	public void setName(String newName) {
			name = newName;
	}
	
	public String getGender() {
		return gender;
	}
}
