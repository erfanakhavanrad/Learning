public class representationtest
{
    public static void main (String [] args)
    {
        double v=17.0;
        double a=3.42567824;
        System.out.print("start:");
        System.out.print(v);


        v=v/a;
        System.out.print("/ a: ");
        System.out.print(v);

        v=v - 1.0;
        System.out.print("- 1.0: ");
        System.out.print(v);

        v=v*a;
        System.out.print("*a : ");
        System.out.print(v);

        v=v+a;
        System.out.print("+ a : ");
        System.out.print(v);


    }
}