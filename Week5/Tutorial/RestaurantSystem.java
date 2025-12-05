package Week5.Tutorial;
import java.util.Scanner;


/**
 * Write a description of class RestaurantSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RestaurantSystem
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        int choice,quantity,totalBill=0;
        
        do
        {
            System.out.println("1.Burger Rs.200");
            System.out.println("2.Momo Rs.100");
            System.out.println("3.Pizza Rs.300");
            System.out.println("0:Bill");
            
            System.out.println("Enter the choice:");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("You have chosen Burger.");
                    System.out.println("Enter the quantity.");
                    quantity=sc.nextInt();
                    totalBill+=quantity*200;
                    break;
                case 2:
                    System.out.println("You have chosen Momo.");
                    System.out.println("Enter the quantity.");
                    quantity=sc.nextInt();
                    totalBill+=quantity*100;
                    break;
                case 3:
                    System.out.println("You have chosen Pizza.");
                    System.out.println("Enter the quantity.");
                    quantity=sc.nextInt();
                    totalBill+=quantity*300;
                    break;
                case 0:
                    System.out.println("The totalBill:"+" "+totalBill);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    
            }
        }while(choice!=0);
        
    }
}
