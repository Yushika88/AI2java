package Week5.Tutorial;

/**
 * Write a description of class SumOfNaturalNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfNaturalNumber
{
    public static void main(String[]arg)
    {

        int sum=0;
        for(int i=1;i<=10;i++)
        {
            //sum=sum+i;
            sum+=i;
        }
        System.out.println(sum);
    }
}
