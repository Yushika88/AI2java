package Week4;
import java.util.Scanner;


/**
 * Write a description of class PaperSizeChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PaperSizeChecker
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of paper(A0-A5):");
        String paperSize=sc.nextLine();
        
        switch(paperSize)
        {
            case "A0":
                System.out.println("841x1189mm(33.1x46.8 inches)");
                break;
            case "A1":
                System.out.println("594x841mm(23.4x33.1 inches)");
                break;
            case "A2":
                System.out.println("420x594mm(16.5x23.4 inches)");
                break;
            case "A3":
                System.out.println("297x420mm(11.7x16.5 inches)");
                break;
            case "A4":
                System.out.println("210x297mm(8.3x11.7 inches)");
            case "A5":
                System.out.println("148x210mm(5.8x8.3 inches)");
            default:
                System.out.println("Invalid size.");
        }
    }
}