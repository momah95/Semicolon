import java.util.Scanner;
	public class IntegerChallenge{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
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
	if (a > b && a > c && a > d && a > e ){
	System.out.printf("The largest number is %d%n",a);
	}
	if (b > a && b > c && b > d && b > e ){
	System.out.printf("The largest number is %d%n",b);
	}
	if (c > a && c > b && c > d && c > e ){
	System.out.printf("The largest number is %d%n",c);
	}
	if (d > a && d > b && d > c && d > e ){
	System.out.printf("The largest number is %d%n",d);
	}
	if (e > a && e > b && e > c && e > d ){
	System.out.printf("The largest number is %d%n",e);
	}
	if (a < b && a < c && a < d && a < e ){
	System.out.printf("The smallest number is %d%n",a);
	}
	if (b < a && b < c && b < d && b < e ){
	System.out.printf("The smallest number is %d%n",b);
	}
	if (c < a && c < b && c < d && c < e ){
	System.out.printf("The smallest number is %d%n",c);
	}
	if (d < a && d < b && d < c && d < e ){
	System.out.printf("The smallest number is %d%n",d);
	}
	if (e < a && e < b && e < c && e < d ){
	System.out.printf("The largest number is %d%n",e);
	}	
}
 }
	