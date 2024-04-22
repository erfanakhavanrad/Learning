package mySelf.multiThreading;

/**
 * @author Erfan Akhavan Rad
 * @created 04/22/2024
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            MultiThread multiThread = new MultiThread(i);
//            Thread newThread = new Thread(multiThread);
//            newThread.start();
            multiThread.start();
            System.out.println(multiThread.isAlive());
            multiThread.join();
        }

    }
}
