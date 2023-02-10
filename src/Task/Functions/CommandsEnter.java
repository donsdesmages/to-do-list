package Task.Functions;

import Task.Functions.AddTasks;
import Task.Main;

public class CommandsEnter extends AddTasks {

    public static void commandThree () {
            System.out.println("Кол-во задач на данный момент:" + " " + "[" + Main.taskList.size() + "]");
        }

    public static void commandTwo () {

        try {
            if (Main.taskList.isEmpty()) {
               Main.notActiveTasksPrint();
            }
            else {
                Main.taskList.forEach(System.out::println);
            }
        }
        catch (IndexOutOfBoundsException exception) {
            System.out.println("Статус программы: Возможно произошла ошибка");
        }
    }
}
