package Week5.ExtraQuestions;
import java.util.Scanner;

/**
 * Write a description of class PrimeNumberCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeNumberCheck
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int a=num;
        if(num==0||num==1)
        {
            System.out.println("Not a Prime Number.");
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Prime Number.");
                break;
            }
            else
            {
                System.out.println("Not a Prime Number.");
            }
        }
    }
}