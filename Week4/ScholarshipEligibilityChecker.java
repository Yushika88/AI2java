package Week4;
import java.util.Scanner;

/**
 * Write a description of class ScholarshipEligibilityChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScholarshipEligibilityChecker
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the gpa:");
        float gpa=sc.nextFloat();
        System.out.println("Enter the percentage of attendance:");
        float attendance=sc.nextFloat();
        System.out.println("Enter the attitude score(1-10):");
        float attitude=sc.nextFloat();

        if(gpa>=3.2) 
        {
            if(attendance>80 && attitude<5)
            {
                System.out.println("Eligible for scholarship!!");
            }
            else
            {
                System.out.println("Not eligible for scholarship");
            }

        }
        else
        {
            System.out.println("Not eligible for scholarship");
        }

    }
}