package Task.Functions;
import static Task.Functions.TextForConsole.notActiveTasksPrint;
import static Task.Main.taskList;

public class GetTheLastTask  {

    public static void getLastTask () {
        if (!taskList.isEmpty()){
            System.out.println(taskList.get(taskList.size() - 1));
        }
        else {
            notActiveTasksPrint();
        }
    }
}
