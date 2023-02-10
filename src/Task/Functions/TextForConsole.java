package Task.Functions;

import Task.Functions.ValidationForTask;

import java.util.Scanner;

public class TextForConsole {

    public static void WelcomePrint() {
        System.out.println(" \t\t _______________________________________________________________________");
        System.out.println(" \t\t Welcome to [To-Do-List],press any key for work start");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void SelectCommands() {
        System.out.println(" \t\t <<<<<<<< MENU >>>>>>>>");
        System.out.println(" \t\t ----------------------");
        System.out.println(" \t\t Press you need command");
        System.out.println(" \t\t 1. ADD TASK");
        System.out.println(" \t\t 2. VIEW TASK");
        System.out.println(" \t\t 3. SHOW NUMBER OF TASKS");
        System.out.println(" \t\t 4. GET LAST TASK");
        System.out.println(" \t\t 5. DELETE ALL TASKS");
    }

    public static void headMenuCalling() {
        System.out.println("________________________________________________________");
        System.out.println("Если вы хотите вызвать MENU, нажмите цифру - '0'.");
        ValidationForTask.headMenuCallingValidation();

    }

    public static void NotCommandRepeatYouEnter () {
        System.out.println("Not have this command,repeat you press");
    }
}
