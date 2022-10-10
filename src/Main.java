import static Utilidades.Utilidades.*;

import ui.UIMenu;

public class Main {

	public static void main(String[] args) {
		
		printText("Iniciando programa");
		
		Doctor myDoctor = new Doctor();
		myDoctor.name = "Yerko Cortes";
		myDoctor.showName();
		myDoctor.showId();
//		printText(myDoctor.id);
		
		Doctor myDoctorYerko = new Doctor();
		myDoctorYerko.showId();
//		printText(myDoctor.id);
		
		UIMenu.showMenu();
		
	}

}
