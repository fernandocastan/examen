package FCF;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Que dia de la semana es hoy?");
		if(in.hasNextInt()){
			int dia=in.nextInt();
			switch (dia) {
				case 1:System.out.println("lunes");
					break;
				case 2:System.out.println("martes");
					break;
				case 3:System.out.println("miercoles");
					break;
				case 4:System.out.println("jueves");
					break;
				case 5:System.out.println("viernes");
					break;
				case 6:System.out.println("sabado");
					break;
				case 7:System.out.println("domingo");
					break;
				default:System.out.println("Valor no valido");
		}
	}
		else 
			System.out.println("un nº de dia de la semana");
	}
}
