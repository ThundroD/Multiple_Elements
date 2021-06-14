package multipleElements;
import java.util.Arrays;
import java.util.Scanner;

public class MultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
	    int[][] multiples = new int[3][4];
	    for (int i = 0; i < 4; i++)//for loop asks a user to enter 5 test scores to put into the array
	    {
	        System.out.println("Please enter an integer:");
	        multiples[0][i] = input.nextInt();
	    }
	    
	    //create second array row
	    multiples[1][0]= multiples[0][0] * 2; //multiply first row by 2
	    multiples[1][1]= multiples[0][1] * 2;
	    multiples[1][2]= multiples[0][2] * 2;
	    multiples[1][3]= multiples[0][3] * 2;
	    //create third array row
	    multiples[2][0]= multiples[0][0] * 3; //multiply second row by 3
	    multiples[2][1]= multiples[0][1] * 3;
	    multiples[2][2]= multiples[0][2] * 3;
	    multiples[2][3]= multiples[0][3] * 3;
	    
	    System.out.println(Arrays.deepToString(multiples));
	}

}
