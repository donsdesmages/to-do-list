package Task.Functions;

import Task.Main;

public class ClassDeleteTask extends AddTasks {

    public static boolean deleteTask() {

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
            System.out.println("Невозможно удалить. Нет активных задач");
        }
        return false;
    }
}
