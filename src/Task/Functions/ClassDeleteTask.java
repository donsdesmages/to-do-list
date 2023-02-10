package Task.Functions;
import Task.Main;
import Task.Task;

import java.util.Scanner;

public class ClassDeleteTask {

    public static void deleteTaskByItsName () {

        if (!Main.taskList.isEmpty()) {

            System.out.println("Введите имя задачи ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            Task forDeleteTask = null;
            if (Main.taskList.stream().filter(el -> el.getName().equalsIgnoreCase(name)).count() > 0) {
                for (Task task : Main.taskList) {
                    if (task.getName().equalsIgnoreCase(name)) {
                        forDeleteTask = task;

                    }
                }

                Main.taskList.remove(forDeleteTask);
                System.out.println("Задача с указанным именем удалена");

                return;
            }
            System.out.println("Задача не была найдена");
            return;
        }
       TextForConsole.noDeleteNotActiveTasks();
    }

    public static boolean deleteAllTask() {

        if ((!Main.taskList.isEmpty())) {

            for (int i = 0; i < Main.taskList.toArray().length; i++) {
                Main.taskList.remove(i);
            }
            if (!(Main.taskList.isEmpty())) {
                Main.taskList.remove(0);
            }
            System.out.println("ALL TASKS WAS DELETED!");
        }
        else {
            TextForConsole.noDeleteNotActiveTasks();
        }
        return false;
    }
}
