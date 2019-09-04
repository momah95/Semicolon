import java.util.Scanner;
	public class Character{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first character:");
	char first = input. next(). charAt(0);
	System.out.print("Enter  second character:");
	char second = input. next(). charAt(0);
	System.out.print("Enter third character:");
	char third = input. next(). charAt(0);
	System.out.print("Enter fourth character:");
	char fourth = input. next(). charAt(0);
	System.out.printf("This character %c has an integer value of %d%n ", first, (int) first);
	System.out.printf("This character %c has an integer value of %d%n ", second, (int) second);
	System.out.printf("This character %c has an integer value of %d%n ", third, (int) third);
	System.out.printf("This character %c has an integer value of %d%n ", fourth, (int) fourth);
	
}
	}

