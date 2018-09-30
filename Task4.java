package task4;

import java.util.Scanner;

public class Task4 {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Ввведите своё имя");
        String str = scanner.next();
        getName(str);

    }

    private static void getName (String name) {
        System.out.println ("Привет, " + name);
    }
}
