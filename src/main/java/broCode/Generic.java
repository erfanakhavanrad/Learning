package broCode;

public class Generic {
    public static void main(String[] args) {

        Integer[] integers = {2, 6, 4, 31, 3, 6};
        Double[] doubles = {5.5, 3.3, 6.6, 8.8, 9.8};
        Character[] characters = {'H', 'T', 'Q', 'P', 'N'};
        String[] strings = {"TPG", "PGR", "SFC"};

        displayArray(integers);
        displayArray(doubles);
        displayArray(characters);
        displayArray(strings);

        MyGenericClass<Integer, String> myInt = new MyGenericClass<>(3, "Ge");
        MyGenericClass<Double, String> myDouble = new MyGenericClass<>(5.3, "R");
        System.out.println("***********");

        System.out.println(myInt.getT());
        System.out.println(myDouble.getT());

//        MyGenericClass<Character> myCharacter = new MyGenericClass<>();
//        MyGenericClass<String> myString = new MyGenericClass<>();

    }

    private static <T> void displayArray(T[] Array) {
        for (T t : Array) {
            System.out.println(t);
        }
    }

    private static class MyGenericClass<T extends Number, V extends String> {
        T t;
        V y;

        public MyGenericClass(T t, V y) {
            this.t = t;
            this.y = y;
        }

        public V getT() {
            return this.y;
        }
    }


}
