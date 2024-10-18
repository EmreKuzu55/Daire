package notort;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {

	
		
		int r;
		double pi =3.14;
		
		int a ;
		
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Dairenin yarıçapını Giriniz : ");
		r = inp.nextInt();
		
		System.out.print("Açıyı Giriniz : ");
		
		a= inp.nextInt();
		
		
		
		Double alan = (pi*(r*r)*a)/360;
		
		System.out.println("Dairenin Alanı : " + alan);
		
		
	} 

}
 