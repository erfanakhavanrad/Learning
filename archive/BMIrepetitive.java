import  java.util.*;
public class BMIrespective
{
    public static final double BMI_SCALE = 703.0;
    public static final int FEET_TO_INCHES = 12;

    public static double bmiformula (double weight , double height )
    {
        return BMI_SCALE * weight / (height*height);
    }
    public static void oneinteraction()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("enter weight: ");
        double weight = keyboard.nextDouble();
        System.out.print("enter height in Feet and Inches: ");
        double feet = keyboard.nextDouble();
        double inches = keyboard.nextDouble();
        double height = FEET_TO_INCHES*feet + inches;
        double bmi = bmiformula(weight,height);
        System.out.println("your BMI is "+ bmi + inches);
        }
        public static void main (String [] args)
        {
            for (int i= 1;i<=10;i=i+1 )
            {
                System.out.println("this is round " + i + ".");
                oneinteraction();
            }
        }
    }
