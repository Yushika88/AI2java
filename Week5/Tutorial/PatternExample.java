package Week5.Tutorial;


/**
 * Write a description of class PatternExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatternExample
{
   public static void main(String[]arg)
   {
       for(int i=1;i<=3;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }
}
