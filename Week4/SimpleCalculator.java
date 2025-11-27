package Week4;
import java.util.Scanner;

/**
 * Write a description of class SimpleCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalculator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber:");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the secondNumber:");
        int secondNumber=sc.nextInt();
        System.out.println("Enter the operation you want to perform(+,-,/,*)");
        char choice=sc.next().charAt(0);

        switch(choice)
        {
        case '+': System.out.println("Addition="+(firstNumber+secondNumber));
        break;
        case '-': System.out.println("Subtraction="+(firstNumber-secondNumber));
        break;
        case '/': System.out.println("Division="+(firstNumber/secondNumber));
        break;
        case '*': System.out.println("Multiplication="+(firstNumber*secondNumber));
        break;
        default:
            System.out.println("Invalid choice!");
        }
        
    }
}