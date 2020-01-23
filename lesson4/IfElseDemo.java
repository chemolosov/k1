package lesson4;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            verifyNamber(a);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

    private static void verifyNamber(int a) {
        if (a > 0 && a < 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное ");
        }
    }
}