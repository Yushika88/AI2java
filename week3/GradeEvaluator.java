package week3;

import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
     public static void main(String[]arg)
     {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter your numericGrade:");
         int numericGrade=sc.nextInt();
         
         //to check the grade
         String checkGrade=(numericGrade>=40)?"Pass":"Fail";
         
         System.out.println(checkGrade);
         
     }
}
