import java.util.Scanner;
public class Multiplication{
	public  static void main(String[] args){
	   Scanner input = new Scanner(System.in);	
           System.out.print("Enter first input:" );
           int input1 = input.nextInt();
           System.out.print("Enter second input:");
           int input2 = input.nextInt();
           int multiply = input1 * input2;
           System.out.printf("Multiplication is %d%n", multiply);

	}	
}