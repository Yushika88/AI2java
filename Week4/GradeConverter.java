package Week4;
import java.util.Scanner;


/**
 * Write a description of class GradeConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeConverter
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your GPA:");
        float gpa=sc.nextFloat();
        
        if(gpa>=3.6 || gpa==4.0)
        {
            System.out.println("A+");
        }
        else if(gpa>=3.2)
        {
            System.out.println("A");
        }
        else if(gpa>=2.8)
        {
            System.out.println("B+");
        }
        else if(gpa>=2.6)
        {
            System.out.println("B");
        }
        else if(gpa>=2.2)
        {
            System.out.println("C+");
        }
        else if(gpa>=1.8)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }
        
    }
}