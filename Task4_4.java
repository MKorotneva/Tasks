import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        // Дан массив. Вывести на экран сначала его неотрицательные элементы, затем
        // отрицательные.
        System.out.println("Введите длину массива:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float [] array = new float[n];
        System.out.println("Введите "+n+" элементов массива");

        for (int i=0; i<n; i++) {
        array[i] = sc.nextFloat();
        }
        sc.close();
        System.out.println("Неотрицательные элементы массива: ");
        for (int i=0; i<n; i++) {
            if (array[i] > 0) {
                System.out.printf("%.2f ; ",array[i]);
            }
        }
        System.out.println();
        System.out.println("Отрицательные (и нулевые) элементы массива: ");
        for (int i=0; i<n; i++) {
                if (array[i] <= 0) {
                    System.out.printf("%.2f ; ",array[i]);
                }
        }
        System.out.println();

    }
}
