package FCF;

import java.util.Scanner;

public class flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		boolean asc=true;
		boolean desc=true;
		int nums;
		
		System.out.print("cuantos numeros:");
		if(in.hasNextInt()) {
			nums=in.nextInt();
			int veces,anterior=0,actual=0;
			for(veces=1;veces<=nums;veces++) {
				System.out.print("dime el"+veces+"º: ");
				if(veces>1)
					anterior=actual;
				actual=in.nextInt();
				if(veces>1) {
					if(actual>anterior)
						desc=false;
					if(actual<anterior)
						asc=false;
				}
				
			}
			if(asc) 
				System.out.println("ascentente");
			else if(desc)
				System.out.println("descendiente");
			else
				System.out.println("sin orden");
		}	
	}

}
