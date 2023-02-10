package Task.Functions;
import static Task.Functions.TextForConsole.errorNameOrPriority;
import static Task.Functions.TextForConsole.errorTime;

class validationForTask  {

    public static boolean validation(String name, int priority, int day, int hour, int minute) {
        if (!name.isEmpty() && (priority >= 0 && priority <= 10)) {
            if ((day >= 0 && day <= 31) && (hour >= 0 && hour <= 24) && (minute >= 0 && minute <= 60)) {
                if (day == 0 && hour == 0 && minute == 0) {
                    return false;
                }
            }
            else {
                errorTime();
                return true;
            }
            return false;
        }
        errorNameOrPriority();
        return true;
    }
}
