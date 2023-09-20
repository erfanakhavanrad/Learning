package broCode;

public class OutSide {
    String x = "Hello ";

    public class Inside {
        String y = "World";

        public void greeting() {
            System.out.println(x + y);
        }

    }

    public static void main(String[] args) {
        OutSide outSide = new OutSide();
        OutSide.Inside inside = outSide.new Inside();

        inside.greeting();

    }

}
