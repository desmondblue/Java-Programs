import java.util.Scanner;
public class countvowelconsonant {

	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		String s1 = new String();
		int ctr = 0 ; int vtr = 0;
		System.out.println("Enter the string");
		s1 = scan.nextLine();
		char s2 [] = s1.toCharArray();
		char s3 =' ';
		for(int i =0;i< s2.length;i++){
			
			switch(s2[i]){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vtr++;
				break;
			default:
				if(s2[i]!= s3){
				ctr++;}
				};
			}
			
		
		System.out.println("Vowels in string " + s1 + "and vowels are =" + vtr +" and consonants are = " + ctr);
	}
}
