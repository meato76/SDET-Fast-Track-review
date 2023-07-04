package practice;

import java.util.Scanner;

public class TimeUtil {

    public static int minutesUntilNextHour(String timeStr) {
        String[] timeComponents = timeStr.split(":");
        int hour = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);
        
        int minutesUntilHour = 60 - minutes;
        return minutesUntilHour;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in hh:mm format: ");
        String timeStr = scanner.nextLine();
        scanner.close();

        int minutesLeft = minutesUntilNextHour(timeStr);
        System.out.println("There are " + minutesLeft + " minutes left until the next hour.");
    }
}
