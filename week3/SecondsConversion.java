package week3;

import java.util.Scanner;

/**
 * Write a description of class SecondsConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondsConversion
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the seconds for the conversion:");
       float seconds=sc.nextFloat();
       
       //for conversion
       int hourCheck=(int)seconds/3600;
       int hourRemainder=(int)seconds%3600;
       int minuteCheck=hourRemainder/60;
       int minuteRemainder=hourRemainder%60;
       int secondCheck=minuteRemainder%60;
       
       System.out.println("secondConversion="+hourCheck+":"+minuteCheck+":"+secondCheck);
   }
}
