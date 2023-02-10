package Task.Functions;
import Task.Task;
import java.time.LocalDateTime;
import java.util.Scanner;
import static Task.Functions.TextForConsole.*;
import static Task.Main.taskList;

public class AddTasks {

    public static void addCommandsAndWritingTask() {

        Scanner scanner = new Scanner(System.in);
        addNameForTask();
        String name = scanner.nextLine();

        addPriorityTask();
        int priority = scanner.nextInt();

        addDayForTask();
        int day = scanner.nextInt();

        addHoursForTask();
        int hours = scanner.nextInt();

        addMinuteForTask();
        int minute = scanner.nextInt();

        if (validationForTask.validation(name, priority, day, hours, minute)) {

            System.out.println("Вы ввели не верные данные,попробуйте еще раз:");
            return;
        }
        else {
            System.out.println("________________");
            System.out.println("Задача добавлена");
        }

        LocalDateTime createAtt = LocalDateTime.now();
        LocalDateTime deadline = createAtt.plusDays(day).plusHours(hours).plusMinutes(minute);

        Task task = new Task(name,priority,deadline);
        taskList.add(task);

        WriteObjectInFile.WritingInFile(task);
    }
}
