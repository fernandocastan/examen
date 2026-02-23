package FCF;

import java.util.Scanner;

public class ascensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int piso=-1;
do {
	System.out.println("A que piso quieres ir?");
	if(in.hasNextInt()) 
	   piso=in.nextInt();
	
	else {
		System.out.println("Mete un nº");
		in.nextLine();
	}
}
 while(piso<0 || piso>18);
 
 System.out.println("vas al piso "+piso);

	}

}
