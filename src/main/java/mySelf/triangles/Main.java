package mySelf.triangles;

/**
 * @author Erfan Akhavan Rad
 * @created 01/26/2024
 */
public class Main {
    public static void main(String[] args) {
        int row = 7;
//        rightTriangle(row);
//        upsideDownTriangle(row);
//        leftTriangle(row);
//        pyramid(row);
// TODO: 1/26/2024 Make pyramid look like a diamond. 
    }

    private static void pyramid(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void upsideDownTriangle(int row) {
        System.out.println("upsideDownTriangle");
        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    private static void leftTriangle(int row) {
        System.out.println("leftTriangle");
        for (int i = 0; i < row; i++) {
            for (int j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightTriangle(int row) {
        System.out.println("rightTriangle");
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
