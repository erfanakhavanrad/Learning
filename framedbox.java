import java.util.*;
public class framedbox
{
    //print a rectangular box with "#" with a frame
    // main method
    public static void main (String [] args)
    {
        int height,width,horizontal,vertical;
        Scanner keyboard = new Scanner (System.in);
        //set height and width
        // set height and width
        System.out.println("enter height: ");
        height=keyboard.nextInt();
        System.out.println("enter width: ");
        width =  keyboard.nextInt();
        //**** the top line *******//
        System.out.print("+");
        for ( horizontal = 1; horizontal <= width; vertical++)
        {
            System.out.println("-");
        }
        System.out.println("+");
        //*** the middle lines *******/
        for ( horizontal= 1; horizontal <= height; horizontal++)
        {
            System.out.println("#");
        }
        System.out.println("|");
        //******* the bottom line *****//
        System.out.println("+");
        for ( horizontal=1; horizontal <=width; horizontal ++ );
        {
            System.out.println("-");
        }
        System.out.println("+");
    }
}