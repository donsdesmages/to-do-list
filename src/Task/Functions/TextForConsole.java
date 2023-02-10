package Task.Functions;

import java.util.Scanner;

public class TextForConsole {

    public static void welcomePrint() {
        System.out.println(" \t\t _______________________________________________________________________");
        System.out.println(" \t\t Welcome to [To-Do-List],press any key for work start");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void selectCommands() {
        System.out.println(" \t\t <<<<<<<< MENU >>>>>>>>");
        System.out.println(" \t\t ----------------------");
        System.out.println(" \t\t Press you need command");
        System.out.println(" \t\t 1. ADD TASK");
        System.out.println(" \t\t 2. VIEW TASK");
        System.out.println(" \t\t 3. SHOW NUMBER OF TASKS");
        System.out.println(" \t\t 4. GET LAST TASK");
        System.out.println(" \t\t 5. DELETE ALL TASKS");
        System.out.println(" \t\t 6. DELETE TASK A BY ITS NAME");
    }

    public static void headMenuCalling() {
        System.out.println("________________________________________________________");
        System.out.println("Если вы хотите вызвать MENU, нажмите цифру - '0'.");
        Scanner scanner = new Scanner(System.in);
        while (!(scanner.nextInt() == 0)) {
            System.out.println("Нажмите '0'.,что-бы отобразить MENU");
            }
    }
    public static void notCommandRepeatYouEnter() {
        System.out.println("Not have this command,repeat you press");
    }

    static void addNameForTask () {
        System.out.println("Добавьте имя задачи:");
    }

    static void addPriorityTask () {
        System.out.println("Укажите приоритет задачи:" + "\n" + "от 0 до 10");
    }

    static void addDayForTask () {
        System.out.println("Укажите кол-во дней на выполнение задачи:");
    }

    static void addHoursForTask () {
        System.out.println("Укажите кол-во часов на выполнение задачи:");
    }

    static void addMinuteForTask () {
        System.out.println("Укажите кол-во минут на выполнение задачи:");
    }

    static void noDeleteNotActiveTasks () {
        System.out.println("Невозможно удалить. Нет активных задач");
    }

    static void errorTime () {
        System.out.println("Ошибка: не верно указано время");
    }

    static void errorNameOrPriority () {
        System.out.println("Ошибка: пустое имя или неверно введен приоритет");
    }

    static void notActiveTasksPrint() {
        System.out.println("Активных задач нет.");
    }

}
