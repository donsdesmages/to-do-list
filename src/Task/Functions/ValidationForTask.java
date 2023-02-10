package Task.Functions;

import java.util.Scanner;

public class ValidationForTask {

    public static boolean validation(String name, int priority, int day, int hour, int minute) {
        if (!name.isEmpty() && (priority >= 0 && priority <= 10)) {
            if ((day >= 0 && day <= 31) && (hour >= 0 && hour <= 24) && (minute >= 0 && minute <= 60)) {
                if (day == 0 && hour == 0 && minute == 0) {
                    return false;
                }
            } else {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void headMenuCallingValidation () {
        Scanner scanner = new Scanner(System.in);
        while (!(scanner.nextInt() == 0)) {
            System.out.println("Нажмите '0'.,что-бы отобразить MENU");
        }
    }
}
