import static Utilidades.Utilidades.*;

import static ui.UIMenu.*;

public class Main {

	public static void main(String[] args) {
		
//		showMenu();
		
		Doctor myDoctor = new Doctor("Maria", "Dentista");
		printText(myDoctor.getName());
		printText(myDoctor.getSpeciality());
		
		Patient patient = new Patient("Alejandra", "alejandra@email.com");
		patient.setWeight(54.5);
		System.out.println(patient.getWeight());
		patient.setPhoneNumber("12345678");
		

	}

}
