package mySelf.multiThreading;

/**
 * @author Erfan Akhavan Rad
 * @created 04/22/2024
 */
public class MultiThread extends Thread {
//        implements Runnable{

    private int threadNumber;

    public MultiThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread number " + threadNumber);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}
