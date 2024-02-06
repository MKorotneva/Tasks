package exam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        num1 = sc.nextInt();
        System.out.println("Введите второе целое число: ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("Сумма чисел равна: "+ (num1+num2));

        int diff = Math.abs((num1-num2));
        System.out.println("Разница между "+num1+ " и "+num2+" равна "+ diff);

        System.out.println("Ряд чисел от минимального из этих чисел до максимального:");
        if (num1 <= num2) {
            for (int i=num1; i<=num2; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i=num2; i<=num1; i++) {
                System.out.print(i + " ");
            }
        }


    }

}
