import java.util.Scanner;
   
public class Multiples{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter first integer:");
   int number1 = input.nextInt();
   System.out.print("Enter second integer:");
   int number2 = input.nextInt();
        
	if (number1 % number2 == 0) {
        System.out.print("These numbers are multiples");
        }
	if (number1 % number2 != 0) {
        System.out.print("These numbers are not multiples");
        }



}
 }
// Good code