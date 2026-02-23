package FCF;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
int numero;
System.out.println("dime un numero");
if(in.hasNextInt()) {
	numero=in.nextInt();
	if(numero>=0) {
		while(numero>=0) {
			System.out.println(numero-- +"");
		}
	}
	else
		System.out.println("Que no sea negativo");
}
else System.out.println("Que se un numero");
	}

}
