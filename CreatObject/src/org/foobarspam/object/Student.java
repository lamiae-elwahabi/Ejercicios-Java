package org.foobarspam.object;

public class Student {
		//Propiedades
		private int id = 0;
		private String firstName = " ";
		private String lastName = " ";
		private int birthYear, birthMonth, birthDay = 0;
		//Getters y Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		//Metodos
		public boolean isBirthday() {
			// Return true if it's the student's birthday today.
			return false;
		}
		
		public void giveWarning(boolean isFinalWarning) {
			// You should study harder!
			}
		public int numberOfFriends() {
			// Return the number of friends the student has.
			return 0;
		}

		public static void main(String[] args) {
			Student firstStudent = new Student();
			Student secondStudent = new Student();
			Student thirdStudent = new Student();
			
			firstStudent.id = 1;
			firstStudent.firstName = "Marc";
			
			secondStudent.id = 2;
			secondStudent.firstName = "Sophie";
			
			thirdStudent.id = 3;
			thirdStudent.firstName = "Fatima";
			
			System.out.println("The student object referred to "+
			"by the variable secondStudent has the first "+
			"name: "+secondStudent);

		}


}
