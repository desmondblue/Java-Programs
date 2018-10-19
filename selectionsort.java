package selectionsort;

import java.util.Scanner;



public class selectionsort {

	void sort(int A[],int n){
		int min =0;
		for(int i=0;i<n-1;i++){
			min =i;
			for(int j=i+1;j<n;j++){
				if(A[j]<A[min]){
				min = j;	
				}
			}int temp = A[min];
			A[min]=A[i];
			A[i]= temp;
		}	
		System.out.println("Sorted array");
		for(int i =0;i<n;i++){
			System.out.println(A[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		selectionsort obj = new selectionsort();
System.out.println("Enter size of the array");
 int n = scan.nextInt();
 int a[] = new int[9];
 for(int i=0;i<n;i++){
	 a[i] = scan.nextInt();
 }
	obj.sort(a,n);
	}

	}

