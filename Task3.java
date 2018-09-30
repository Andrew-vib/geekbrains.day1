package task3;

import java.util.Scanner;

public class Task3 {


    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Введите число:");
        int i = scanner.nextInt();

        getNumber(i);

    }

    private static void getNumber (int a) {

        if (a >= 0) {
            System.out.println("Вы ввели положительное число ");
        } else {
            System.out.println ("Вы ввели отрицательное число " );
        }
    }
}
