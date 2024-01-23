import java.util.Scanner;

public class Task4 {
    // Даны три вещественных числа a,b,c.
    // Проверить: 1.выполняется ли неравенство a<b<c;
    // 2.выполняется ли неравенство b>a>c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три вещественных числа");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        sc.close();
        // пункт 1
        if (a < b) {
            if (b < c) {
                System.out.printf("1. Выполняется %f < %f < %f \n", a, b, c);
            } else {
                System.out.printf("1. Не выполняется %f < %f < %f \n", a, b, c);
            }
        }
            // пункт 2
            if (b > a) {
                if (a > c) {
                    System.out.printf("2. Выполняется %f > %f > %f \n", b, a, c);
                } else {
                    System.out.printf("2. Не выполняется %f > %f > %f \n", b, a, c);
                }
            }
    }
}
