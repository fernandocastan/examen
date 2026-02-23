package FCF;

import java.util.Scanner;

public class hipoteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prestamo, deuda, cuota, year, tipointeres;
		Scanner in = new Scanner(System.in);
		System.out.println("Cuanto es el prestamo?");
		if (in.hasNextInt()) {
			prestamo = in.nextInt();
			System.out.println("Cual es el interes?");
			if (in.hasNextInt()) {
				tipointeres = in.nextInt();
				System.out.print("Cuota: ");
				if (in.hasNextInt()) {
					cuota = in.nextInt();
					deuda = prestamo;
					year = 1;
					while (deuda > 0) {
						int intereses = deuda * tipointeres / 100;
						deuda = deuda - cuota + intereses;
						if (deuda <= 0) {
							System.out.println("Ultimo año:\n");
							cuota += deuda;
						}
						System.out.printf("Año %2d, capital %7d,intereses %7d\n", year, cuota - intereses, intereses);
						year++;
					}
				} else
					System.out.println("entero...");

			} else
				System.out.println("numero...");
		}

	}
}
