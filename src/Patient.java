
public class Patient {

	// Attributes
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String bithday;
	private double weight;
	private double height;
	private String blood;

	// Constructor method
	public Patient(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBithday() {
		return bithday;
	}

	public void setBithday(String bithday) {
		this.bithday = bithday;
	}

	public String getWeight() {
		return this.weight + " kg.";
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return this.height + " mts.";
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() > 0 && phoneNumber.length() <= 8) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("El numero telefonico debe contener los 8 digitos validos.");
		}
	}

	// To String
	@Override
	public String toString() {
		return "Patient [name=" + name + ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", bithday=" + bithday + ", weight=" + weight + ", height=" + height + ", blood=" + blood + "]";
	}

}
