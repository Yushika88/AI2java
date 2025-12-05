package Week5.ExtraQuestions;
import java.util.Scanner;


/**
 * Write a description of class CountEvenOddDigit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountEvenOddDigit
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter a number:");
       int number=sc.nextInt();
       
       int remainder=0,countOdd=0,countEven=0;
       while(number!=0)
       {
           remainder=number%10;
           if(remainder%2==0)
           {
               countEven++;
           }
           else
           {
               countOdd++;
           }
           number/=10;
       }
       System.out.println("Even Digits="+" "+countEven);
       System.out.println("Odd Digits="+" "+countOdd);
   }
}