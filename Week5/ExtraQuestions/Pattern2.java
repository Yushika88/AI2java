package Week5.ExtraQuestions;


/**
 * Write a description of class Pattern2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern2
{
    /**
     * pattern- * * * * *
     *          * * * *
     *          * * * 
     *          * * 
     *          *  
     */
    public static void main(String[]arg)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}