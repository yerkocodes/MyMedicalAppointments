import static Utilidades.Utilidades.*;

public class Doctor {
	// Atributos
	static int id; // autoincrement
	String name;
	String speciality;
	
	//Constructor
	Doctor() {
		printText("Construtendo el Objeto Doctor");
		id++;
	}
	
	//Comportamientos o metodos
	
	public void showName() {
		printText(name);
	}
	
	public void showId() {
		printText("ID Doctor: " + id);
	}

}
