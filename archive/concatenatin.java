public class concatenatin
{
	public static void main ( String[] args)
	{
		String address1=
		" four score and seven"
		+ "on this continent,"
		+ "created equal";
		System.out.println(address1);
		String mystring="abcde";
		int myinteger =10;
		double mydouble=9.5;
		System.out.println("mystring=" +mystring);
		System.out.print("myinteger=" +myinteger);
		System.out.print("mydouble=" +mydouble);
		System.out.print("mystring + myinteger + mydouble=");
		System.out.print(mystring + myinteger + mydouble);
		
		System.out.println("addition");
		System.out.println(myinteger+mydouble);
		System.out.println("multiplication");
		System.out.println(myinteger*mydouble);
	}
}