import static Utilidades.Utilidades.*;

public class Doctor {
	// Atributos
	static int id; // autoincrement
	String name;
	String speciality;
	
	//Constructor
	public Doctor() {
		printText("Construtendo el Objeto Doctor");
	}
	
	public Doctor(String name, String speciality) {
		printText("El nombre del Doctor asignado es: " + name);
		id++;
		this.name = name;
		this.speciality = speciality;
	}

	//Comportamientos o metodos
	
	public void showName() {
		printText(name);
	}
	
	public void showId() {
		printText("ID Doctor: " + id);
	}

}
