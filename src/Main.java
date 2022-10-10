import static Utilidades.Utilidades.*;

import static ui.UIMenu.*;

public class Main {

	public static void main(String[] args) {
		
//		showMenu();
		
		Doctor myDoctor = new Doctor("Maria", "Dentista");
		printText(myDoctor.name);
		printText(myDoctor.speciality);
		
	}

}
