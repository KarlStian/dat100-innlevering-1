import java.util.Scanner;

public class O1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Skriv din Bruttoinntekt: ");

		double inntekt = scanner.nextDouble();
		double trinnskatt = 0;

		// Trinnskattsatser:
		// Trinn 0: Ingen trinnskatt for inntekt mellom 0 - 226 100
		// Trinn 1: 226 101 - 318 300 kr (1,7 %)
		// Trinn 2: 318 301 - 725 050 kr (4,0 %)
		// Trinn 3: 725 051 - 980 100 kr (13,7 %)
		// Trinn 4: 980 101 - 1 467 200 kr (16,8 %)
		// Trinn 5: fra og med 1 467 201 kr (17,8 %)

		if (inntekt > 226100) {
			trinnskatt += (inntekt - 226100) * 0.017;
		}
		if (inntekt > 318300) {
			trinnskatt += (inntekt - 318300) * 0.04;
		}
		if (inntekt > 725050) {
			trinnskatt += (inntekt - 725050) * 0.137;
		}
		if (inntekt > 980100) {
			trinnskatt += (inntekt - 980100) * 0.168;
		}
		if (inntekt > 1467200) {
			trinnskatt += (inntekt - 1467200) * 0.178;
		}

		System.out.printf("Din trinnskatt er: %.2f kr%n", trinnskatt);
		scanner.close();
	}
}
