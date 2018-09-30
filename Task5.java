package task5;

import java.util.Scanner;

public class Task5 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа для высчитывания високосных годов");
        System.out.print ("Введите год: ");
        int inputYears = scanner.nextInt();

        getYears (inputYears);

    }
    private static void getYears (int year) {

        if ((year % 4) == 0 && (year % 100) != 0) {
            System.out.println (year + " високосный год");
        } else if ((year % 4) == 0 && (year % 400) == 0 && (year % 100) == 0){
          System.out.println (year + " високосный год");
        }
        else {
            System.out.println (year + " не високосный год");
        }
    }
}
