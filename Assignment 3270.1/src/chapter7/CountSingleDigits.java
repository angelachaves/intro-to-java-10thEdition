package chapter7;

public class CountSingleDigits {

	public static void main(String[] args) {
		int[] digits= new int[10];
		
		for(int i=0, j=0;i<100;i++) {
			j=(int)(Math.random()*10);
			digits[j]+= 1;
		}
		
		for(int i=0;i<digits.length;i++){
			System.out.println("Count of "+i+":"+digits[i]);
		}
	}

}