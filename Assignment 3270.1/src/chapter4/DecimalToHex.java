package chapter4;
import java.util.Scanner;
public class DecimalToHex {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		char hex=' ';
		
		System.out.println("Enter a decimal value (0 to 15):");
		 int decNum = input.nextInt();
		 
		 if(decNum<0 || decNum > 15) {
			 System.out.println(decNum +" is an invalid input.");
			 return;
		 }
		 
		if(decNum >=0 && decNum <=9) {
			System.out.println("The hex value is " + decNum);
		}
		else if (decNum >= 10 && decNum<=15) {
			hex= (char)(decNum + ('A'-10)) ;
			System.out.println("The hex value is "+ hex);
		}
		 
		 
	}	

}