package experiment2;

import java.util.Scanner;

public class largestof3 {

	int largest(int a ,int b, int c){

		int large = a>b?(a>c?a:c):(b>c?b:c);
		return large;
	}
	public static void main (String a[]){
		Scanner scan = new Scanner(System.in);
		largestof3 functioncall = new largestof3();
		int x,y,z;
		System.out.println("Enter the three numbers seperated by a space :");
		x= scan.nextInt();
		y=scan.nextInt();
		z=scan.nextInt();
		
		int largest=functioncall.largest(x,y,z);
	System.out.println("Out of the three numbers " +x + ", "+ y + " and " + z+".\nThe largest number is "+ largest);
	}
}
