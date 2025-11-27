package Week4;
import java.util.Scanner;


/**
 * Write a description of class TaxSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxSystem
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Annual Income:");
       float annualIncome=sc.nextFloat();
       
       if(annualIncome<=500000)
       {
           double t1=annualIncome*0.01;
           System.out.println("Total Tax="+t1);
       }
       else if(annualIncome<=700000)
       {
           double t2=annualIncome*0.1+5000;
           System.out.println("Total Tax="+t2);
       }
       else if(annualIncome<=1000000)
       {
           double t3=annualIncome*0.2+15000;
           System.out.println("Total Tax="+t3);
       }
       else if(annualIncome<=2000000)
       {
           double t4=annualIncome*0.3+35000;
           System.out.println("Total Tax="+t4);
       }
       else if(annualIncome<=5000000)
       {
           double t5=annualIncome*0.36+335000;
           System.out.println("Total Tax="+t5);
       }
       else if(annualIncome>5000000)
       {
           double t6=annualIncome*0.39+1135000;
           System.out.println("Total Tax="+t6);
       }
   }
}