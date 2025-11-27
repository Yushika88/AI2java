package Week4;
import java.util.Scanner;



/**
 * Write a description of class EvenOddExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOddExample
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        
        //conditional control statement to check
        if(number%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");                                                                                                                                                                                                                                       
        }
    }
}