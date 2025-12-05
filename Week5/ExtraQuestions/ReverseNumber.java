package Week5.ExtraQuestions;
import java.util.Scanner;


/**
 * Write a description of class ReverseNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseNumber
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int a=number;
        
        int reverse=0,remainder;
        while(number!=0)
        {
            remainder=number%10;
            reverse=reverse*10+remainder;
            number/=10;
        }
        System.out.println("The reverse is:"+" "+reverse);
        if(a==reverse)
        {
            System.out.println("The number is Palindrome.");
        }
        else
        {
            System.out.println("The number is not palindrome.");
        }
    }
}