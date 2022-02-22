/*
* File: trapter.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft I N
* Date: 2022-02-22
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

import java.util.Scanner;
class trapter {
		public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Santa Renata Diana, Szoft I N, 2022-02-22");
			System.out.println("Feladat 0316");
			
			
			System.out.print("a oldal: ");
			double a = scan.nextDouble();
			
			System.out.print("b oldal: ");
			double b = scan.nextDouble();
			
			System.out.print("c oldal: ");
			double c = scan.nextDouble();
			
			System.out.print("d oldal: ");
			double d = scan.nextDouble();
			
			double terulet = (a+c)/4*(a-c)*Math.sqrt((a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d));
			System.out.print("Terulet: " + terulet);
		
		}
}
