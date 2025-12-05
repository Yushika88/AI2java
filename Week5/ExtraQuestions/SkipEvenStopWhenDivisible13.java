package Week5.ExtraQuestions;


/**
 * Write a description of class SkipEvenStopWhen13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SkipEvenStopWhenDivisible13
{
    public static void main(String[]arg)
    {
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else{
                System.out.print(i+" ");
            }
            
            if(i%13==0)
            {
            break;
            }
        }
    }
}