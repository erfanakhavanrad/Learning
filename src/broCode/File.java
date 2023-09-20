package broCode;

import java.io.FileReader;
import java.io.FileWriter;

public class File {

    private static String fileName = "Poem.txt";

    public static void main(String[] args) {


        fileChecker();
        createFile();
        readFile();

    }

    private static boolean fileChecker() {
        java.io.File file = new java.io.File("message.txt");
        if (file.exists()) {
            System.out.println("That file exists.");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();
            return true;
        } else {
            System.out.println("The file doesn't exist.");
            return false;
        }
    }

    private static void createFile() {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Roses are red. \n");
            fileWriter.append("Violets are Blue. \n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            FileReader fileReader = new FileReader(fileName);
            int data = fileReader.read();
            System.out.println();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
