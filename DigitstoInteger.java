import java.util.Scanner;
   
public class DigitstoInteger{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter your first digit:");
   int digit1 = input.nextInt();
   System.out.print("Enter your second digit:");
   int digit2 = input.nextInt();
   System.out.print("Enter your third digit:");
   int digit3 = input.nextInt();
   System.out.print("Enter your fourth digit:");
   int digit4 = input.nextInt();
   System.out.print("Enter your fifth digit:");
   int digit5 = input.nextInt();
   System.out.printf("%d   %d   %d   %d   %d",digit1,digit2,digit3,digit4,digit5);
}
 }