package Week5.ExtraQuestions;


/**
 * Write a description of class SumOfOddNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfOddNumbers
{
    public static void main(String[]arg)
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                 sum+=i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to 10 is"+" "+sum);
    }
}