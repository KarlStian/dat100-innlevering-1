// Karakterskala:
//A = 90–100
//B = 80–89
//C = 60–79
//D = 50–59
//E = 40–49
//F = 0–39

import java.util.Scanner;

public class O2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Skriv din poengsum: ");
		int karakter = scanner.nextInt();
		String bokstavkarakter;
		if (karakter >= 90 && karakter <= 100) {
			bokstavkarakter = "A";
		} else if (karakter >= 80 && karakter <= 89) {
			bokstavkarakter = "B";
		} else if (karakter >= 60 && karakter <= 79) {
			bokstavkarakter = "C";
		} else if (karakter >= 50 && karakter <= 59) {
			bokstavkarakter = "D";
		} else if (karakter >= 40 && karakter <= 49) {
			bokstavkarakter = "E";
		} else if (karakter >= 0 && karakter <= 39) {
			bokstavkarakter = "F";
		} else {
			bokstavkarakter = "Ugyldig poengsum (0-100)";
		}
		System.out.println("Din bokstavkarakter er: " + bokstavkarakter);
		scanner.close();
	}
}