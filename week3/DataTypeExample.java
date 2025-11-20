package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg)
    {
        //to check the max and min value,etc of integer
        //wrapper class
        //static variable always capital(snake case)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE); //gives in bit
        
        //for float
        System.out.println(Float.MAX_VALUE+"\n"+Float.MIN_VALUE+"\n"+Float.BYTES+"\n"+Float.SIZE);
        
        System.out.println("My name is \"Yushika\" ");
        
        byte b=12;//max range is 127, if more it gives error
        
        byte d=13;
        
        byte e=(byte)(b+d);
        
        float f=(float)233.3; //by default it reads double so either (float)233.3 or 233.3f
        
        long l=200;
        
        int a=20;
        float g=2.33f;
        double h=2.334;
        
        double x=(double)(a+g+h);
        System.out.println(x);
        
        
        //to check ascii value
        char c='A';
        System.out.println((int)c);
        
        
        //to check char of integer
        int y=50;
        System.out.println((char)c);

        
        //to find are and perimeter of rectangle
        int length=10;
        int breadth=20;
        int area=length*breadth;
        System.out.println("Area="+area);
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter="+perimeter);
        
        
        //to find simple interest,compound interest
        int principle=500;
        int time=2;
        float rate=2.4f;

        float SI=(float)(principle*time*rate)/100;
        float CI=(float)(principle*Math.pow((1+(rate/100)),time)-principle);
        
        System.out.println("SI="+SI);
        System.out.println("CI="+CI);
        
    }
}