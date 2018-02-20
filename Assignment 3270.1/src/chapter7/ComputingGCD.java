package chapter7;
import java.util.Scanner;
public class ComputingGCD {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] user=new int[5];
		System.out.println("Enter 5 integers:");
		
		for(int i=0; i<user.length;i++) {
			user[i]=input.nextInt();
		}
		
		System.out.println("The gcd is "+ gcd(user));
		
	}

	public static int gcd(int... numbers) {
		int size = numbers.length;
		int gcd = 1;
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		for (int j = min; j >= 1; j--) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] % j == 0) {
					gcd = min;
				}
			}
		}
		return gcd;
	}
}
