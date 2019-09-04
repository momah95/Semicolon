import java.util.Scanner;
public class Multiplication{
	public  static void main(String[] args){
	   Scanner input = new Scanner(System.in);	
           System.out.print("Enter first input:" );
           int somto = input.nextInt();
           System.out.print("Enter second input:");
           int somtor = input.nextInt();
           int multiply = somto * somtor;
           System.out.printf("Multiplication is %d%n", multiply);

	}	
}
