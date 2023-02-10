package Task.Functions;
import Task.Task;
import com.sun.tools.javac.Main;
import java.io.*;
import java.util.List;

public class WriteObjectInFile extends Main {

    public static void WritingInFile (Task task) throws RuntimeException {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("task.bin",true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(task);

            objectOutputStream.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void ReadObjectFromFile(List<Task> taskList) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("task.bin");

            while (fileInputStream.available() != 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Task task = (Task) objectInputStream.readObject();
                if (task != null)
                    taskList.add(task);
            }
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
