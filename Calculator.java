import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
        //to take input
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the firstNumber:");
        int firstNumber=sc.nextInt();
        
        System.out.println("Enter the secondNumber:");
        int secondNumber=sc.nextInt();
        
        //for calculation
        int addition=firstNumber+secondNumber;
        int subtraction=firstNumber-secondNumber;
        int multiplication=firstNumber*secondNumber;
        int division=firstNumber/secondNumber;
        int greatestNumber,lowestNumber;
        greatestNumber=(firstNumber>secondNumber)?firstNumber:secondNumber;
        lowestNumber=(firstNumber<secondNumber)?firstNumber:secondNumber;
        
        //to print the calculation
        System.out.println("The addition is: "+addition);
        System.out.println("The subtraction is: "+subtraction);
        System.out.println("The multiplication is: "+multiplication);
        System.out.println("The division is: "+division);
        System.out.println("The greatestNumber is: "+greatestNumber);
        System.out.println("The lowestNumber is: "+lowestNumber);
        
    }
}