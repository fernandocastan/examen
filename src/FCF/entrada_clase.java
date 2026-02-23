package FCF;

import java.util.Scanner;

public class entrada_clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int alumnos=0;
		
		do{
			System.out.println("Cuantos sois?");
			if(in.hasNextInt()) {
				 alumnos = in.nextInt();
			in.nextLine();
			}else {
				System.out.println();
				in.nextLine();
			}
		}while(alumnos<=0);

		while (alumnos > 0) {
			System.out.println("Como os llamais? ");
			String nombres = in.nextLine();
			System.out.println("Hola " + nombres);
			alumnos--;

		}
	}
}
