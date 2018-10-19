package experiment2;
import java.util.Scanner;
public class threedigitcombinations {

	void combine(int x,int y,int z){
		int i ,j,k;
		int array[]={x,y,z};
		System.out.println("Possible numbers from the digits "+ x +" "+ y+" " + z +" are:");
		for(i=0;i<3;i++){
			
			
			
			for(j=0;j<3;j++){
				
				if(array[j]!=array[i]){
					System.out.print(array[i]);
					System.out.print(array[j]);
				
				for(k=0;k<3;k++){
					if(array[k]!=array[j] && array[k]!=array[i]){
						System.out.print(array[k]);
						break;										}
							}System.out.print("\n");
									}
						}
				
			}
		}
	
	
	public static void main(String[] args) {
		threedigitcombinations methodcall = new threedigitcombinations();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three digits seperated by space");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		methodcall.combine(x, y, z);
	}

}
