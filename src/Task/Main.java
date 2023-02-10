package Task;

import Task.Functions.*;

import java.io.IOException;
import java.util.*;

/** 1. Добавление задачи   (работает)
 *  2. Просмотр задачи   (работает)
 *  3. Просмотр кол-ва задач   (работает)
 *  4. Иформирование об отсутствии задач   (работает)
 *  5. Удаление всех задач (работает)
 *  6. Уведомление о не верно введенных данных при создании задачи   (работает)
 *  7. Запись в файл   (работает)
 *  8. Чтение из файла   (работает)
 *  9. Показать последнюю добавленную задачу (работате)
 *  10. Назначение статуса задачи   ???
 *
 */

public class Main {

    public static List<Task> taskList = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        whileWorkingWithCommands();

    }
    public static void notActiveTasksPrint() {
        System.out.println("Активных задач нет.");
    }

    static void ReadObjects() throws IOException {
        WriteObjectInFile.ReadObjectFromFile(taskList);
    }

    public static CommandsEnter whileWorkingWithCommands() throws IOException, ClassNotFoundException {

        ReadObjects();

        Scanner scanner = new Scanner(System.in);

        TextForConsole.WelcomePrint();

        while (true) {

            TextForConsole.SelectCommands();

            int scan = scanner.nextInt();

            switch (scan) {
                case 1 : {
                    AddTasks.AddCommandsAndWritingTask();
                    TextForConsole.headMenuCalling();
                    break;
                }
                case 2 :
                {
                    CommandsEnter.commandTwo();
                    TextForConsole.headMenuCalling();
                    break;
                }
                case 3 : {
                    CommandsEnter.commandThree();
                    TextForConsole.headMenuCalling();
                    break;
                }
                case 4 : {
                    GetTheLastTask.getLastTask();
                    TextForConsole.headMenuCalling();
                    break;
                }
                case 5 : {
                    ClassDeleteTask.deleteTask();
                    TextForConsole.headMenuCalling();
                    break;
                }
                default :
                    TextForConsole.NotCommandRepeatYouEnter();
                    break;
            }
        }
    }
}





