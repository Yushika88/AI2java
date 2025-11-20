package Week2;

import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current waterLevel:");
        int waterLevel=sc.nextInt();
        
        //to display current water level
        System.out.println("The current waterLevel is: "+waterLevel);
        
        //to display warning message
        String displayStatus;
        displayStatus=(waterLevel>1000)?"WARNING:Water level has reached 1000L":"Status:Normal";
        System.out.println(displayStatus);
    }
}
