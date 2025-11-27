package week3;
import java.util.Scanner;


/**
 * Write a description of class DaysConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DaysConverter
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of days:");
        int dayInput=sc.nextInt();
        
        //conversion
        int yearCount=dayInput/365;
        int yearRemainder=dayInput%365;
        int monthCount=yearRemainder/30;
        int monthRemainder=yearRemainder%30;
        int dayCount=monthRemainder%30;
        
        System.out.println(yearCount +"Years\t" +monthCount+"Months\t"+dayCount +"Days");
        
    }
}