package mySelf.lambdaExpressions;

/**
 * @author Erfan Akhavan Rad
 * @created 04/12/2024
 */
@FunctionalInterface
public interface Printable {
    String print(String name);

    default void cropText() {
        System.out.println("Cropping");
    }

    ;
}
