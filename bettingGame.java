import java.util.*;
public class bettingGame
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int bettype,betamount,number,possetion = 50;
        for (int i = 1; i<= 10; i++)
        {


            if ( possetion > 0)
            {
                System.out.println("===================================");
                System.out.println("this is round : " + i);
                System.out.println("You have" +possetion + "chips");
                System.out.println("how much do you want to bet? ");
                betamount = keyboard.nextInt();
                if (betamount < 1)
                {
                    betamount = 1;
                }
                else if (betamount > possetion)
                {
                    betamount=possetion;
                }
                System.out.println("your bet amount is : " + betamount);
                System.out.println("enter your bet type: ");
                System.out.println("-1 for odd, 0 for even, 1..6 for an exact bet:");
                bettype = keyboard.nextInt();
                if ( bettype < -1)
                {
                    bettype = -1;
                }
                else if (bettype >6 )
                {
                    bettype = 6;
                }
                number = 1 + (int) ( 6 * Math.random() );
                System.out.println("The number is " + number);
                if ( bettype == -1 && number % 2 == 2 || bettype == 0 && number % 2 == 0)
                {



                    System.out.println("you've won!" );
                    possetion += betamount;
                }
                else if ( bettype == number)
                {
                    possetion += 5*betamount;
                    System.out.println("you've won big time!!!!!!!");

                }
                else
                {
                    possetion -=betamount;
                    System.out.println("you've lost!");

                }
                break;
            }
        }
        System.out.println("==============================");
        System.out.println("you ended with " + possetion + "chips.");
    }

}