import java.util.*;
public class switcht
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        char charvalue =keyboard.next().charAt(0);
      /*  next().charAt(0).next()
        token = keyboard.next();
        switch (token.charAt(0))
            */
        switch (charvalue)
        {
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
                case 'c':
                    System.out.println("c");
                    break;
            case 'd':
                System.out.println("d");
                break;
            case 'e':
                System.out.println("e");
                break;
            default:
                System.out.println("nothing found");
                break;
        }
        String month = january;
        switch (month.toLowerCase())
        {
            case "JANUARY":
                System.out.println("january");
                break;
            default:
                System.out.println("You suck!");
                break;
        }
    }
}