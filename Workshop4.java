import java.util.Scanner;

/**
 * Write a description of class Workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4
{
   public static void main(String[]arg)
   {
       
   //to store the data
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the studentName:");
   String studentName=sc.nextLine();
   
   System.out.println("Enter the Age:");
   int studentAge=sc.nextInt();
   
   System.out.println("Enter the GPA:");
   float studentGPA=sc.nextFloat();
   
   //to print the data
   System.out.println("The studentName is: "+studentName);
   System.out.println("The studentAge is: "+studentAge);
   System.out.println("The studentGPA is: "+studentGPA);
   
   }
   
   
}