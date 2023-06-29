public class ShortHandExperiment
{
    public static void main (String[] args)
    {
        int myint,other;
        myint=10;
        other=13;
        System.out.print("my int is");
        System.out.print(myint);
        System.out.print(", other is");
        System.out.println(other);

        myint+=other;
        System.out.print("executed myint += other\tmyint is");
        System.out.println(myint);

        myint*=other;
        System.out.print("executed myint *= other\tmyint is");
        System.out.println(myint);

        myint-=other;
        System.out.print("executed myint -= other\tmyint is");
        System.out.println(myint);

        myint/=other;
        System.out.print("executed myint /= other\tmyint is");
        System.out.println(myint);

        myint %=other;
        System.out.print("executed myint %= other\tmyint is");
        System.out.println(myint);

        myint += ++other;
        System.out.print("executed myint += ++other\tmyint is");
        System.out.print(myint);
        System.out.print(", other is now ");
        System.out.println(other);

        myint += other++;
        System.out.print("executed myint += other ++\tmyint is");
        System.out.print(myint);
        System.out.print(", other is now ");
        System.out.println(other);

        myint += --other;
        System.out.print("executed myint += --other\tmyint is");
        System.out.print(myint);
        System.out.print(", ohter is now ");
        System.out.println(other);

        myint += other--;
        System.out.print("executed myint += other--\tmyint is ");
        System.out.print(myint);
        System.out.print(", other is now");
        System.out.print(other);

    }
}