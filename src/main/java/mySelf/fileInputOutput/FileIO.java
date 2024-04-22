package mySelf.fileInputOutput;

import java.io.*;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class FileIO {
    public static void main(String[] args) {
        String[] names = {"John", "Carl", "Jerry"};
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt")); // Relative path
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Tiny\\Desktop\\Work\\output.txt")); // Absolute path
            bufferedWriter.write("Writing into this file.");
            bufferedWriter.write("\n \t Here is another line.");

            for (String name : names) {
                bufferedWriter.write("\n " + name);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("$$$$$$$$$$$$$");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt")); // Relative path
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
