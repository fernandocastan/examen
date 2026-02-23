package FCF;

import java.util.Scanner;

public class boolean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("a que planta quieres ir?");
int planta=in.nextInt();
if ((planta>=1 || planta<=18)&&planta!=13)
	System.out.println("vas a la planta "+planta);
else 
	System.out.println("Error");
	}

}
