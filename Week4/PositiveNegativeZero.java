package Week4;
import java.util.Scanner;


/**
 * Write a description of class ExaminationCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegativeZero
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=sc.nextInt();
        
        if(number>=0)
        {
            if(number==0)
            {
                System.out.println("The number is zero.");
            }
            else
            {
                System.out.println("The number is positive.");
            }
        }
        else
        {
            System.out.println("The number is negative");
        }
        
        
    }
}