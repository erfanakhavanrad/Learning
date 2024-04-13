package mySelf.lambdaExpressions;

/**
 * @author Erfan Akhavan Rad
 * @created 04/12/2024
 */
public class Lambdas {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.print("String"); /*OR*/
        printThing(cat);


        printThing(
                (Jesse) -> {
                    System.out.println("Method implemented here. + " + Jesse);
                    return "Result";
                }
        );


        Printable printableLambdaExpression = (CustomName) ->
                "SECOND Method implemented here. + " + CustomName;
        printThing(printableLambdaExpression);

    }

    static void printThing(Printable printable) {
        printable.print("printable");
    }

}
