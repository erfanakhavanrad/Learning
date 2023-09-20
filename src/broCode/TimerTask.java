package broCode;

import java.util.Calendar;
import java.util.Timer;

public class TimerTask {
    static int counter = 10;

    public static void main(String[] args) {
        Timer timer = new Timer();

        java.util.TimerTask timerTask = new
                java.util.TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("Task is complete");

                        if (counter > 0) {
                            System.out.println("Counting seconds: " + counter);
                            counter--;
                        } else {
                            System.out.println("Happy New Year!");
                            timer.cancel();
                        }

                    }
                };

//        timer.schedule(timerTask, 3000);
//        timer.schedule(timerTask, calendarTask().getTime());
        timer.scheduleAtFixedRate(timerTask, 0, 2000);
    }

    private static Calendar calendarTask() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 9);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }


}
