package Task;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Serializable {

    public static Main Main;
    private static String name;
    private static Integer priority;
    private static LocalDateTime deadline;

    public Task(String name, Integer priority, LocalDateTime deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;

    }

    public static String getName() {
        return name;
    }

    public static Integer getPriority() {
        return priority;
    }

    public static LocalDateTime getDeadline() {
        return deadline;
    }

    public static void setDeadline(LocalDateTime deadline) {
        Task.deadline = deadline;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------");
        return "Task" + "\n"
            + "\n" + "name:" + " "
            + name + '\n' + "priority:" + " "
            + priority + "\n" + "deadline:"
            + " " + deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority, deadline);
    }
}
