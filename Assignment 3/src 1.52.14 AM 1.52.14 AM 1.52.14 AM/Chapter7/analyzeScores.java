package Chapter7;
import java.util.Scanner;
public class analyzeScores {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	 final int max= 100;
	 int[] scores= new int[max];
	 int sum=0;
	 int average=0;
	 int numberOfScores=0;
	 int aboveOrequal=0;
	 int below=0;
	 System.out.println("Enter the scores and then a negative number:");
	 
	 for(int i=0 ; i< max ; i++, numberOfScores++) {
		 scores[i]= input.nextInt();
		 if(scores[i]<0)
			 break;
		 
		 
		 sum += scores[i];	 	 
	 }
	
	 average= sum/numberOfScores;
	
	 for(int i =0; i< numberOfScores; i++) {
		  if(scores[i]>= average)
			  aboveOrequal++;
		  if(scores[i]< average)
			  below++; 
	 }
	
	 System.out.println("There are "+ below +" numbers below average and "+ aboveOrequal+ " nummbers above or equal to the average.");
	
	
}
}
