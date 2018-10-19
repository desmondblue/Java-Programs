package insertionsort;

import java.util.Scanner;

public class insertionsort {
void sort(int A[],int n){
	int i,j,v;
	for(i = 2;i <= n-1; i++){
		v= A[i];
		j=i;
		while(A[j-2]>v&&j>=1){
			A[j]=A[j-1];
			j--;
		}
		A[j]=v;
	}
	System.out.println("Sorted array");
	for(i =0;i<n;i++){
		System.out.println(A[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		insertionsort obj = new insertionsort();
System.out.println("Enter size of the array");
 int n = scan.nextInt();
 int a[] = new int[10];
 for(int i=0;i<n;i++){
	 a[i] = scan.nextInt();
 }
	obj.sort(a,n);
	}
	

}
