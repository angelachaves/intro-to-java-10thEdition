package chapter7;

public class EightQueens {

	public static void main(String[] args) {

		String[][] array = new String[8][8];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = "| ";
			}
		}


		for(int j=0; j<array.length;j++) {
		placeQ(array,j);
		}
		//print array
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array.length; b++) {
				System.out.print(array[a][b]);
			}
			System.out.print("|");
			System.out.println();
		}
	}
	
	
	public static boolean placeQ(String[][] array ,int j) {
		if(j> array.length) {
			return true;
		}
		
		boolean queenInColumn=false;
		int i=0;
		
		while(!queenInColumn && i< array.length) {
			if(!isSafe(array, i, j)) {
				i++;
			}
			else {
				addQ(array,i,j);
				
				if(placeQ(array,j+1)) {
					deleteQ(array,i,j);
					i++;
				}
			}
		}
		return queenInColumn;
	}
	
	public static void addQ( String[][] array,int i, int j) {
		array[i][j]="|Q";
	}
	
	public static void deleteQ(String[][] array, int i, int j) {
		array[i][j]="| ";
	}
	
	
	public static boolean isSafe(String[][] array, int i, int j) {
		if(diaganolCheck(array, i, j)&& columnCheck(array, i)&& rowCheck(array,j)){
			return true;
		}
		return false;
	}
	

	public static boolean columnCheck(String[][] array, int row) {
		for (int i = 0; i < array.length; i++)
			if (array[row][i] == "|Q")
				return false;
		return true;
	}

	public static boolean rowCheck(String[][] array, int column) {
		for (int i = 0; i < array.length; i++)
			if (array[i][column] == "|Q")
				return false;
		return true;
	}

	public static boolean diaganolCheck(String[][] array,int i, int j) {
		for(int k=i ,h=j; k>=0 && h>=0; k--,h--) {
			if(array[k][h]=="|Q") 
				return false;
		}
		
		for(int k=i ,h=j; k<=7 && h>=0; k++,h--) {
			if(array[k][h]=="|Q") 
				return false;
		}
		
		//for(int k=i ,h=j; k<=7 && h<=0; k++,h++) {
		//	if(array[k][h]=="|Q") 
		//		return false;
		//}
		
		//for(int k=i ,h=j; k>=7 && h<=7; k--,h++) {
		//	if(array[k][h]=="|Q") 
		//		return false;
		//}
		
		return true;
	}


	

}