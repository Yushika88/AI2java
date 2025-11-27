package Week4;
import java.util.Scanner;

/**
 * Write a description of class SellingPriceSwitchCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceSwitchCase
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the item:");
        float markedPrice=sc.nextFloat();
        System.out.println("Enter the category of the item(A,B,C,D):");
        char category=sc.next().charAt(0);

        System.out.println("Enter the category of item you want to buy:");
        char choice=sc.next().charAt(0);
        char upper=Character.toUpperCase(choice);

        switch(upper)
        {
        case 'A': 
            double sp1=markedPrice-(markedPrice*0.6);
            System.out.println("The total price after discout="+sp1);
            break;

        case 'B':
            double sp2=markedPrice-(markedPrice*0.4);
            System.out.println("The total price after discout="+sp2);
            break;

        case 'C':
            double sp3=markedPrice-(markedPrice*0.2);
            System.out.println("The total price after discout="+sp3);
            break;

        case 'D':
            double sp4=markedPrice-(markedPrice*0.1);
            System.out.println("The total price after discout="+sp4);
            break;
        default:
            System.out.println("Invalid Choice");
        }

    }
}