package experiment2;
import java.util.Scanner;
public class sumsquarearray {

	public static void main(String argz[]){
	 	
	 int sum =0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter numbers you want to enter");int n = scan.nextInt();
				int array[] = new int[n];
				System.out.println("enter the numbers seperated by a space");
		
		for (int i =0;i<n;i++){
			array[i]= scan.nextInt();
			sum+= array[i]*array[i];			
		}
		
		System.out.println("The sum of squares of the entered numbers = "+ sum);
	}
}
