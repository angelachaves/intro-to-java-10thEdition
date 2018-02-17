package chapter4;
import java.util.Scanner;
public class PhoneKeyPad {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num=0;
		
		System.out.println("Enter a letter:");
		String user= input.next();

		char letter= Character.toUpperCase(user.charAt(0));
		
		switch(letter) {
		case 'A': case 'B': case 'C': num= 2; break;
		case 'D': case 'E': case 'F': num= 3; break;
		case 'G': case 'H': case 'I': num= 4; break;
		case 'J': case 'K': case 'L': num= 5; break;
		case 'M': case 'N': case 'O': num= 6; break;
		case 'P': case 'Q': case 'R': case 'S': num= 7; break;
		case 'T': case 'U': case 'V': num= 8; break;
		case 'W': case 'X': case 'Y': case 'Z': num= 9; break;
		default: System.out.println(letter + " is an invalid input."); return;
		}
		
		System.out.println("The corresponding number is: " + num);
	}

}
