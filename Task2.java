package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Введите число а");
        int a = scanner.nextInt();
        System.out.println ("Введите число b");
        int b = scanner.nextInt();

        getBool(a, b);

    }

    private static void getBool (int a, int b){

        boolean bool = (a+b) >= 10 && (a+b) <=20;

        if (bool) {
            System.out.println("Значение: " + bool);
        }
        else {
            System.out.println ("Значение: " + bool);
        }
    }
}
