package week3;

import java.util.Scanner;

/**
 * Write a description of class aa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        //to take user input
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the firstNumber:");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the secondNumber:");
        int secondNumber=sc.nextInt();

        //relational operations
        int greatestNumber=(firstNumber>secondNumber)?firstNumber:secondNumber;
        int lowestNumber=(firstNumber<secondNumber)?firstNumber:secondNumber;
        String equalNumber=(firstNumber==secondNumber)?"The numbers are equal":"The numbers are not equal";

        //to print output for relational operations
        System.out.println("The greatestNumber is:"+greatestNumber+"\n"+"The lowestNumber is:"+lowestNumber+"\n"+equalNumber);

        //logical operations
        String equalCheck1=(firstNumber>secondNumber && secondNumber<firstNumber)?"The numbers are not equal":"The numbers are equal";
        String equalCheck2=(firstNumber==secondNumber || secondNumber==firstNumber)? "The numbers are not equal":"The numbers are equal";

        //to print output
        System.out.println(equalCheck1);
        System.out.println(equalCheck2);
    }
}
