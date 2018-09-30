package task1;

public class Task1 {

    public static void main (String[] args){

        System.out.println ("Возращаем значение с плавающей точкой " + getValue(10, 6, 10,  9));

    }

    private static float getValue(int a, int b, int c, int d){
        float value = a * (b + (c / d));
        return value;
    }
}
