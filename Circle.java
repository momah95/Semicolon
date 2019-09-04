import java.util.Scanner;

public class Circle{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter radius:");
int radius = input.nextInt();
System.out.printf("The diameter is %d%n", 2 * radius);
System.out.printf("The circumference is %f%n", 2 * radius * Math.PI);
System.out.printf("The area is %f%n", radius * radius * Math.PI);
}
 }