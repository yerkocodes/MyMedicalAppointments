package ui;

import static Utilidades.Utilidades.printText;

import java.util.Scanner;

public class UIMenu {
	public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Obtubre", "Noviembre", "Diciembre"};
	public static void showMenu() {
		printText("Welcome to My Appointments");
		printText("Selecciona la opción deseada");

		int response = 0;
		do {
			printText("1. Doctor");
			printText("2. Patient");
			printText("0. Salir");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				printText("Doctor");
				break;
			case 2:
				response = 0;
				showPatientMenu();

				break;
			case 0:
				printText("Thank you for you visit");
				break;
			default:
				printText("Please select a correct answer");
			}
		} while (response != 0);
	}

	private static void showPatientMenu() {
		int response = 0;
		do {
			printText("\n\n");
			printText("Patient");
			printText("1. Book an appointment");
			printText("2. My appointments");
			printText("0. Return");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				printText("::Book an appointment");
				for (int i = 1; i < 3; i++) {
					printText(i+ ". " + MONTHS[i]);
				}
				break;
			case 2:
				printText("::My appointments");
				break;
			case 0:
				showMenu();
				break;
			}
		} while (response != 0);
	}
}
