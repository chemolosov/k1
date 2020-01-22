package lesson3;

import java.util.Scanner;

public class Scanner32 {
    public static void main(String[] agre) {
        System.out.println("Введите первое целое число");
        Scanner scn1 = new Scanner(System.in);
        if (scn1.hasNextInt()) {
            int i = scn1.nextInt();
            System.out.println("Введите второе целое число");
            Scanner scn2 = new Scanner(System.in);
            if (scn2.hasNextInt()) {
                int k = scn2.nextInt();
                System.out.println("Сумма" + i + "и" + k + "равна " + (i = k));

            } else System.out.println("Ошибка. Вы ввели не целое число");
        } else System.out.println("Ошибка. Вы ввели не целое число ");

    }


}

