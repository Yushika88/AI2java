package Week5.ExtraQuestions;
import java.util.Scanner;


/**
 * Write a description of class MultipleTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultipleTable
{
    public static void main(String[]arg)
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                int multiply;
                multiply=i*j;
                System.out.println(i+"x"+j+"="+multiply);
            }
        }
        System.out.println();
        System.out.println();
    }
}