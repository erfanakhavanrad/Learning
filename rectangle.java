public class rectangle 
{
	public static void line ()
	{
		System.out.println("+----+");
	}
	public static void section ()
	{
		System.out.println("|     |");
	}
	public static void onerectangle()
	{
		line();
		section();
		section();
		section();
		line();
	}
	public static void main ( String [] args)
	{
		onerectangle();
		onerectangle();
		onerectangle();
	}
}