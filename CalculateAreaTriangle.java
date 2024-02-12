package calculateareatriangle;
import java.util.Scanner;
public class CalculateAreaTriangle 
{

    public static void main(String[] args) 
    {
       
       System.out.print("This program will calculate");
       System.out.print(" ");
       System.out.println("the area of a triangle.");
       
       
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the base of a triangle: ");
       double base = keyboard.nextDouble();
       System.out.print("Enter the height of a triangle: ");
       double height = keyboard.nextDouble();
       double area = .5 * base * height;
       System.out.print("The area of the triangle is: ");
       System.out.println(area);
       
       
    }
    
    
}
