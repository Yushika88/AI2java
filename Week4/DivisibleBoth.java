package Week4;
import java.util.Scanner;


/**
 * Write a description of class DivisibleBoth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleBoth
{
    public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        
        if(num%3==0 && num%5==0)
        {
            System.out.println("Divisible by both.");
        }
        else if(num%3==0)
        {
            System.out.println("Divisible by 3.");
        }
        else if(num%5==0)
        {
            System.out.println("Divisible by 5.");
        }
        else
        {
            System.out.println("Not divisible by both.");
        }
    }
}