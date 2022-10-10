import static Utilidades.Utilidades.*;

public class Doctor {
	// Attributes
	public static int id; // autoincrement
	private String name;
	private String speciality;
	
	//Constructor method
	public Doctor() {
		printText("Construtendo el Objeto Doctor");
	}
	
	public Doctor(String name, String speciality) {
		printText("El nombre del Doctor asignado es: " + name);
		id++;
		this.name = name;
		this.speciality = speciality;
	}

	// Methods
	public void showName() {
		printText(name);
	}
	
	public void showId() {
		printText("ID Doctor: " + id);
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	// To String 
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", speciality=" + speciality + "]";
	}

}
