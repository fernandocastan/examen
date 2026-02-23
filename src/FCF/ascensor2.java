package FCF;

import java.util.Scanner;

public class ascensor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("a que piso quieres ir? ");
		int npiso=in.nextInt();
		int pisoactual;
		for(pisoactual=0;pisoactual<=10;pisoactual+=npiso) {
			System.out.print(pisoactual);
		}
	}

}
