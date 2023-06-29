import java.util.Scanner;
//an example of using scanner
public class scannerexample
{
	public static void main ( String [] args)
	{
		Scanner console;
		String theword;
		int thewholenumber;
		double therealnumber;
		console=new Scanner ( System.in);
		System.out.println("enter a string:");
		theword=console.next();
		System.out.println("enter an int:");
		thewholenumber=console.nextInt();
		System.out.println("enter a double");
		therealnumber=console.nextDouble();
		System.out.println("you have entered ");
		System.out.println(theword);
		System.out.println(",");
		System.out.println(thewholenumber);
		System.out.println(",and ");
		System.out.println(therealnumber);
		System.out.println();
	}
}