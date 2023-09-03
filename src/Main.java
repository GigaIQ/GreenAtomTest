import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int task2(int a, int b, int f) {
        a = b - a;
        b -= a;
        a += b;

        return a;
    }

    public static boolean task3_2(String inputStr) {
        String lowerCaseStr = inputStr.toLowerCase();
        char[] charArray = lowerCaseStr.toCharArray();

        int correctCounter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[charArray.length - i - 1]) {
                correctCounter++;
            }
        }

        return correctCounter == charArray.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===Task2===");
        System.out.print("введите число а - ");

        int a = scan.nextInt();
        System.out.print("введите число b - ");
        int b = scan.nextInt();
        scan.nextLine();

        System.out.println("Входное значение а = " + a);
        System.out.println("Входное значение b = " + b);

        a = task2(a, b, b = a);
        System.out.println("Выходное значение a = " + a);
        System.out.println("Выходное значение b = " + b);

        System.out.println("==========");
        System.out.println();

        System.out.println("===Task3===");
        System.out.print("Введите строку - ");
        String inputStr = scan.nextLine();

        if (task3_2(inputStr)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }

        System.out.println("==========");
    }
}