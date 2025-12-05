package Week5.ExtraQuestions;


/**
 * Write a description of class Pattern1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern1
{
    /**
     * 5
     * 5 4
     * 5 4 3
     * 5 4 3 2 
     * 5 4 3 2 1
     */
    public static void main(String[]arg)
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}