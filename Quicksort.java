package experiment1;
import java.util.*;
public class Quicksort {
static void quicksort(int x[],int first , int last){
	int i,j,temp,pivot;
	if(first <last){
		pivot=first;
		i=first;
		j=last;
		while(i<j){
			while(x[i]<=x[pivot]&&i<last){
				i++;
				}
			while(x[j]>x[pivot]&&j>first){
				j--;
			}
			if(i<j){
				temp = x[i];
				x[i]= x[j];
				x[j]=temp;
			}
		}
		temp = x[pivot];
		x[pivot]=x[j];
		x[j] = temp;
		quicksort(x,first,j-1);
		quicksort(x,j+1,last);
		
	}
}

	public static void main(String args[]){
	
	int size ,i;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of array : ");
	size = scan.nextInt();
	int x[] = new int[size];
	System.out.println("Enter the values for the array");
	for(i=0;i<size;i++){
		
		x[i]= scan.nextInt();
						}
	quicksort(x,0,size-1);
	
	System.out.println("Sorted array : \n");
	for(i=0;i<size;i++){
		System.out.println((i+1) + "=>" + x[i]);
	}

							}	
}
 