import java.util.Scanner;
	public class NegativePositive{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int negative = 0;
	int positive = 0;
	int zero = 0;
	System.out.print("Enter first number:");
	int a = input.nextInt();
	System.out.print("Enter second number:");
	int b = input.nextInt();
	System.out.print("Enter third number:");
	int c = input.nextInt();
	System.out.print("Enter fourth number:");
	int d = input.nextInt();
	System.out.print("Enter fifth number:");
	int e = input.nextInt();
	if (a > 0){
	       positive = positive + 1;
	}
	if (b > 0){
		positive = positive + 1;
	}
	if (c > 0){
		positive = positive + 1;
	}
	if (d > 0){
		positive = positive + 1;
	}
	if (e > 0){
		positive = positive + 1;
	}
	if (a < 0){
		negative = negative + 1;
	}
	if (b < 0){
		negative = negative + 1;
	}
	if (c < 0){
		negative = negative + 1;
	}
	if (d < 0){
		negative = negative + 1;
	}
	if (e < 0){
		negative = negative + 1;
	}
	if (a == 0){
		zero = zero + 1;
	}
	if (b == 0){
		zero = zero + 1;
	}
	if (c == 0){
		zero = zero + 1;
	}
	if (d == 0){
		zero = zero + 1;
	}
	if (e == 0){
		zero = zero + 1;
	}
	System.out.printf("Positive = %d%n", positive);
	System.out.printf("Negative = %d%n", negative);
	System.out.printf("Zero = %d%n", zero);
}
 }