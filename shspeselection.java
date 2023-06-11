import java.util.*;
public class shapeselection
 {
   public static void main (String [] args)
   {
     Scanner keyboard = new Scanner (System.in);
	 int choice,height;
	 System.out.println("****************************");
	 System.out.println("this program prints a shape of your choice");
	 System.out.println(" select by entering number");
	 System.out.println(" 0. right-angle triangle");
	 System.out.println(" 1. isosceles");
	 System.out.println(" 2. square");
	 System.out.println(" 3. parallelogram");
	 System.out.println("*****************************");
	 System.out.println("enter your choice: ");
	 choice = keyboard.nextInt();
	 System.out.println("enter height");
	 height = keyboard.nextInt();
	 
	System.out.println("here is your figure!");
	switch (choice)
	{
	 case 0: right-angle (height) ; break;
	 case 1: isosceles (height); break;
     case 2: square (height); break;
     case 3: parallelogram (height); break;	 
	}
	publice static void line ( int whitewidth , int blackwidth )
	{
	 for ( int i = 1; i<= whitewidth; i++)
	 {
	  System.out.println("");
	 }
	 for ( int i = 1; i <= blackwidth; i++)
      {
	   System.out.println("#");
	  }	
       System.out.println("");	  
	}
	public static void right-angle (int height) 
	{
 	  for ( int i = 1; i <= height; i++)
	  {
	   line (0,i)
	  }
	}
	public static void isosceles (int height )
	{
	for ( int i = 1; i <= height; i++)
	 {
	 line ( height -i, i*2 - 1 );
	 }
	}
	public static void square (int height )
	{
	 for ( int i = 1; i <= height; i++)
	 {
	  line (0,height);
	 }
	}
	public static void parallelogram (int height )
	{
	 for ( int i = 1; i <= height; i++)
	 {
	  line (i - , height);
	 }
	}
   }
 }