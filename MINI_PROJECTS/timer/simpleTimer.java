package MINI_PROJECTS.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class simpleTimer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // User input
        System.out.print("Timer format(hh:mm:ss) : ");
        String timeInput = in.nextLine();

        // Getting the data
        String[] timeComponents = timeInput.split(":");
        int hours = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);
        int seconds = Integer.parseInt(timeComponents[2]);

        // User Input
        System.out.print("Start timer: ");
        String start = in.nextLine();

        // Timer Task.
        if ("yes".equals(start)) {
            // Timer Task
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                int secondsLeft = seconds;
                int minutesLeft = minutes;
                int hoursLeft = hours;

                public void run() {
                    if (hoursLeft <= 0 && minutesLeft <= 0 && secondsLeft <= 0) {
                        timer.cancel();
                        System.out.println("Time reached");
                    } else {
                        if (secondsLeft > 0) {
                            secondsLeft--;
                        } else if (minutesLeft > 0) {
                            minutesLeft--;
                            secondsLeft = 59;
                        } else {
                            hoursLeft--;
                            minutesLeft = 59;
                            secondsLeft = 59;
                        }
                    }
                    System.out.printf("%d hours ,%d minutes and %d seconds left.\n", hoursLeft, minutesLeft,
                            secondsLeft);
                }
            };

            // Timer period.
            timer.schedule(task, 0, 1000);

            // Close the scanner
            in.close();
        }
    }
}
