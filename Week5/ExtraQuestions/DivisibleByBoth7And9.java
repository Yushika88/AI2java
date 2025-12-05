package Week5.ExtraQuestions;
import java.util.Scanner;


/**
 * Write a description of class DivisibleByBoth7And9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleByBoth7And9
{
    
    public static void main(String[]arg)
    {        
        for(int i=1;i<=100;i++)
        {
            if(i%7==0 && i%9==0)
            {
                System.out.println("The First Number divisible by 7 and 9 between 1-100 is"+" "+i);
                break;
            }
        }
    }
}