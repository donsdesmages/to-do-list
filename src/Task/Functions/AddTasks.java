package Task.Functions;

import Task.Task;
import java.time.LocalDateTime;
import java.util.Scanner;
import static Task.Main.taskList;

public class AddTasks extends ValidationForTask {

    public static void AddCommandsAndWritingTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Укажите приоритет задачи:" + "\n" + "от 0 до 10");
        int priority = scanner.nextInt();

        System.out.println("Укажите кол-во дней на выполнение задачи:");
        int day = scanner.nextInt();

        System.out.println("Укажите кол-во часов на выполнение задачи:");
        int hours = scanner.nextInt();

        System.out.println("Укажите кол-во минут на выполнение задачи:");
        int minute = scanner.nextInt();

        if (ValidationForTask.validation(name,priority,day,hours,minute)) {

            if (name.isEmpty()) {
                System.out.println("Ошибка: пустое имя");
            }
            if (!(priority >= 0 && priority < 10)) {
                System.out.println("Ошибка: приоретет не верный");
            }
            if (!(day >= 0 && day <= 31)) {
                System.out.println("Ошибка: такого дня не существует");
            }
            if (!(hours >= 0 && hours <= 24)) {
                System.out.println("Ошибка: не верно указано время");
            }
            if (!(minute >= 0 && minute <= 60)) {
                System.out.println("Ошибка: не верно указано время");
            }
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
