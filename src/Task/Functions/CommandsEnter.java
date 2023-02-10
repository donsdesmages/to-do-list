package Task.Functions;
import Task.Main;

public class CommandsEnter  {

    public static void commandThree () {
            System.out.println("Кол-во задач на данный момент:" + " " + "[" + Main.taskList.size() + "]");
        }

    public static void commandTwo () {

        try {
            if (Main.taskList.isEmpty()) {
               TextForConsole.notActiveTasksPrint();
            }
            else {
                Main.taskList.forEach(System.out::println);
            }
        }
        catch (IndexOutOfBoundsException exception) {
            System.out.println("Статус программы: Произошла ошибка");
        }
    }
}
