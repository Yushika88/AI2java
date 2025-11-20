package Week2;

import java.util.Scanner;

/**
 * Write a description of class AusadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AusadhiPasal
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        //for stock of shopkeeper
        System.out.println("For Shopkeeper:");
        System.out.println("The name of the medicine in stock is:");
        String medicineName=sc.nextLine();
        System.out.println("The quantity of the medicine:");
        int medicineQuantity=sc.nextInt();
        System.out.println("The price per tablet is:");
        int medicinePrice=sc.nextInt();        
        
        //for customer
        System.out.println("For Customer:");
        System.out.println("Enter the name of the medicine you want to buy:");
        sc.nextLine();
        String medicineRequired=sc.nextLine();
        System.out.println("Enter the quantity of the medicine:");
        int quantityRequired=sc.nextInt();
        
        //to check the stock
        String checkStock;
        checkStock=(medicineQuantity>quantityRequired)?"In Stock":"Out of Stock";
        
        //to get the total price
        int totalPrice=medicinePrice*quantityRequired;
        
        //to update stock amount
        int updateStock;
        updateStock=medicineQuantity-quantityRequired;
        System.out.println("The remaining stock is: "+updateStock);
        
    }
}
