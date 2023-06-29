import java.util.*;
public class vendingdeposit
{
   public static void main (String [] args)
   {
       Scanner keyboard = new Scanner (System.in);
       int total = 0, inc, count, target = 175;
       String token;
       while ( total < target)
       {
           System.out.printf(" Deposit is %d cents%n", total);
           System.out.println("What coin do you want to deposit? ");
           System.out.print("N for nickel, D for dime, Q for quarter.");
           token = keyboard.next();
           switch (token.charAt(0))
           {
               case 'N': inc = 5; break;
               case 'D': inc = 10; break;
               case 'Q': inc = 25; break;
               default: inc = 0;
           }
           if (inc > 0 )
           {
               System.out.print("How many? ");
               count = keyboard.nextInt();
               total += inc * count;
           }
       }
       System.out.printf("Deposit is %d cents%n ", total);
       System.out.println("Now you can make a selection.");
   }
}