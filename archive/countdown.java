import java.util.* ;
public class countdown
{
    public static void main (String [] args)
    {
        int start,value;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("enter start:");
        start = keyboard.nextInt();
        for ( value = start; value > 0; value--)
        {
            System.out.println (".." + value);
        }
        System.out.println("BOOOOOOOOOOM!");
    }
}