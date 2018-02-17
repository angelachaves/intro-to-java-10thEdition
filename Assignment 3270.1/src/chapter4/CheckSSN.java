package chapter4;
import java.util.Scanner;
public class CheckSSN {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a SSN (DDD-DD-DDDD):");
		
		String ssn= input.nextLine();
		
		if(ssn.length() != 11) {
			System.out.println(ssn + " is an invalid social security number.");
			return;
		}
		
		for(int i=0 ; i< ssn.length(); i++) {
			
			if((i == 3 || i==6) && ssn.charAt(i) != '-' ){
				System.out.println(ssn + " is a invalid social security number."); 
				return;
			}
			
			if(i%3 != 0 && !Character.isDigit(ssn.charAt(i))) {
				System.out.println(ssn + " is a invalid social security number."); 
				return;
				}
		}
		
		System.out.println(ssn + " is a valid social security number.");

	}

}
