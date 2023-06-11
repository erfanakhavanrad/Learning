public class radiusalternative
{
    static final double PI=3.14159265;
    public static void main (String [] args)
    {
        double radius,circleperimeter,circleArea,ballArea,ballvolume;
        radius=10.0;
        circleperimeter=2.0*PI*radius;
        circleArea=radius*circleperimeter/2.0;
        ballArea=4.0*circleArea;
        ballvolume=ballArea*radius/3.0;
        System.out.print("circle perimeter=");
        System.out.println(circleperimeter);
        System.out.print("circle area=");
        System.out.println(circleArea);
        System.out.print("ball area=");
        System.out.print(ballArea);
        System.out.print("ball volume=");
        System.out.print(ballvolume);
    }
}