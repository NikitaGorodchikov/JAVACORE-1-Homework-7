import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static List<String> listOfTasks = new ArrayList<>();

    public static void main(String[] args) {
        String input;
        while (true) {
            System.out.println("Введите номер задачи:");
            System.out.println("1) Новая задача");
            System.out.println("2) Удалить задачу");
            System.out.println("3) Показать список задач");
            System.out.println("4) Изменить задачу");
            System.out.println("5) Выйти из программы");
            input = scan.nextLine();
            if ("5".equals(input)) {
                System.out.println("Goodbye!");
                break;
            } else if ("1".equals(input)) {
                System.out.println("Введите задачу:");
                input = scan.nextLine();
                newTask(input);
            } else if ("2".equals(input)) {
                System.out.println("Введите номер задачи, которую нужно удалить:");
                input = scan.nextLine();
                int remover = Integer.parseInt(input);
                deleteTask(remover);
            } else if ("3".equals(input)) {
                printTasks();
            } else if ("4".equals(input)) {
                System.out.println("Введите номер задачи, которую хотите изменить:");
                input = scan.nextLine();
                int index = Integer.parseInt(input);
                System.out.println("Введите новую задачу:");
                String newTask = scan.nextLine();
                changeTask(index, newTask);
            } else {
                System.out.println("Некорректные данные!");
            }
        }
    }

    public static boolean newTask(String input) {
        return listOfTasks.add(input);
    }

    public static String deleteTask(int index) {
        if (listOfTasks.isEmpty()) {
            System.out.println("Список задач пуст!");
        } else
            try {
                return listOfTasks.remove(index - 1);
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Некорректные данные: " + exception.getMessage());
            }
        return null;
    }

    public static void printTasks() {
        if (listOfTasks.isEmpty()) {
            System.out.println("Список задач пуст!");
        } else
            for (int i = 0; i < listOfTasks.size(); i++) {
                System.out.println(i + 1 + ") " + listOfTasks.get(i));
            }
    }

    public static boolean changeTask(int index, String newTask) {
        if (listOfTasks.isEmpty()) {
            System.out.println("Список задач пуст!");
        } else {
            try {
                listOfTasks.set(index - 1, newTask);
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Некорректные данные: " + exception.getMessage());
            }
        }
        return listOfTasks.get(index - 1).equals(newTask);
    }
}
