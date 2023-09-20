package broCode;

public class Lambda {

    public static void main(String[] args) {


        String text = "Hello World;";
        char symbolSign = '@';
        MyInterface myInterface = (message1, symbol1) -> {
            System.out.println(message1 + symbol1);
        };

        myInterface.message(text, symbolSign);

    }

    @FunctionalInterface
    public interface MyInterface {
        public void message(String message, char symbol);
    }

}
