import java.util.Scanner;
	public class Problem{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number:");
	int a = input.nextInt();
	System.out.print("Enter second number:");
	int b = input.nextInt();
	int sum = a + b;
	int product = a * b;
	int difference = a - b;
	int quotient = a % b;
	System.out.printf(" Sum is %d%n", sum);
	System.out.printf(" Product is %d%n", product);
	System.out.printf(" Difference is %d%n", difference);
	System.out.printf(" Quotient is %d%n", quotient);
}
 }
  