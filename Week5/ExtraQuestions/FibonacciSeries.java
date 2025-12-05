package Week5.ExtraQuestions;


/**
 * Write a description of class FibonacciSeries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciSeries
{
    public static void main(String[]arg)
    {
        int a=0,b=1,c=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}