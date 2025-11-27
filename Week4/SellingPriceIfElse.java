package Week4;
import java.util.Scanner;

/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceIfElse
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the marked price of the item:");
        float markedPrice=sc.nextFloat();
        System.out.println("Enter the category of the item(A,B,C,D):");
        char category=sc.next().charAt(0);

        System.out.println("Enter the category of item you want to buy:");
        char choice=sc.next().charAt(0);

        //sp=mp-(mp*discount%)
        if(choice=='A' || choice=='a')
        {
            float d1=markedPrice*60/100;
            float sp1=markedPrice-d1;
            System.out.println("Total price after discount="+sp1);
        }
        else  if(choice=='B' || choice=='b')
        {
            float d2=markedPrice*40/100;
            float sp2=markedPrice-d2;
            System.out.println("Total price after discount="+sp2);
        }
        else  if(choice=='C' || choice=='c')
        {
            float d3=markedPrice*20/100;
            float sp3=markedPrice-d3;
            System.out.println("Total price after discount="+sp3);
        }
        else if(choice=='D' || choice=='d')
        {
            float d4=markedPrice*10/100;
            float sp4=markedPrice-d4;
            System.out.println("Total price after discount="+sp4);
        }
        else
        {
            System.out.println("Invalid Choice");
        }


    }
}