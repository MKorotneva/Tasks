import java.util.Scanner;

public class Task4_1_3 {
    public static void main(String[] args) {
        // 1. Заполнить массив из двенадцати элементов 1, 2, ... 12.
        //2. Вывести элементы массива на экран в обратном порядке.
        //3. Определить:
            // 1. сумму всех элементов массива;
            //2. произведение всех элементов массива;
            //3. сумму квадратов всех элементов массива;
            //4. сумму шести первых элементов массива
        int [] array = new int[12];
        for (int i=0; i<12; i++) {
        array[i] = (i+1);
        }
        System.out.println("Элементы массива: ");
        for (int i=0; i<12; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
    // в обратном порядке
        System.out.println("В обратном порядке: ");
        for (int i=11; i>=0; i--) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
     //  1. суммa всех элементов массива;
     int sum = 0;
        for (int i=0; i<12; i++) {
           sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов массива: "+sum);

     //2. произведение всех элементов массива;
        long mult = 1;
        for (int i=0; i<12; i++) {
            mult = mult * array[i];
        }
        System.out.println("Произведение всех элементов массива: "+ mult);
     //3. сумму квадратов всех элементов массива;
        double sqSum = 0;
        for (int i=0; i<12; i++) {
            sqSum = (sqSum + Math.pow (array[i], 2));
        }
        System.out.printf("Сумма квадратов всех элементов массива: %.0f", sqSum);
        System.out.println();
     //4. сумму шести первых элементов массива
        sum = 0;
        for (int i=0; i<6; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма первых шести элементов массива: "+sum);
    }
}
