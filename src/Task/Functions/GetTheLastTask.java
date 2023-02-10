package Task.Functions;

import Task.Main;

public class GetTheLastTask extends Main {

    public static void getLastTask () {
        if (!taskList.isEmpty()) {
            System.out.println(taskList.get(taskList.size() - 1));
        }
        else {
            notActiveTasksPrint();
        }
    }
}
