package bubblesort;
import java.util.*;
public class bubblesort {

	void sort(int A[], int n){
		for(int pass=n-1;pass>=0;pass--){
			for(int i =0; i<= pass-1;i++){
				if(A[i]>A[i+1]){
				int temp =A[i];
				A[i]= A[i+1];
				A[i+1]=temp;}
			}
	}
		System.out.println("Sorted array");
		for(int i =0;i<n;i++){
			System.out.println(A[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		bubblesort obj = new bubblesort();
System.out.println("Enter size of the array");
 int n = scan.nextInt();
 int a[] = new int[9];
 for(int i=0;i<n;i++){
	 a[i] = scan.nextInt();
 }
	obj.sort(a,n);
	}

}
