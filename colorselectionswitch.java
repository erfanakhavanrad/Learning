import java.util.*;
//ask about a color and respond
public class colorselectionswitch
{
public static void main (String [] args)
{
 Scanner keyboard = new Scanner (System.in);
 System.out.println("what is your favorite color? ");
 System.out.println(" 1.Orange 2.Green 3.Maize 4.Blue");
 System.out.println("Select fro, 1 to 4 : ");
 int answer = keyboard.nextInt();
 switch (answer)
 {
  case 1:
  case 2:
  System.out.println("Your choice %d is excellent. %n " , answer);
  System.out.println("It is a U. Miami Color!");
  break;
  case 3:
  case 4:
  System.out.println("Your choice %d is excellent. %n " , answer);
  System.out.println("It is a U. Michigan Color!");
  break;
  System.out.printf("Your choice %d is invalid . %n" , answer);
 }
}
}