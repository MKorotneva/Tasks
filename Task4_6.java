import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        // Составить программу:
        //1. нахождения минимального значения среди элементов любой строки
        //    двумерного массива;
        //2. нахождения максимального значения среди элементов любого столбца
        //    двумерного массива
        System.out.println("Введите размерность двумерного массива:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество строк в матрице: ");
        int n = sc.nextInt();
        System.out.println("Количество столбцов в матрице: ");
        int m = sc.nextInt();
        float[][] array = new float[n][m];
        System.out.println("Введите элементы массива (положительные, отрицательные, целые, дробные)");
        // считывание массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Введите номер строки для поиска минимального значения в ней:");
        int str = sc.nextInt();
        System.out.println("Введите номер столбца для поиска максимального значения в нем:");
        int row = sc.nextInt();
        if ((str == 0)|(row == 0)) {
            System.out.println("Введено недопустимое значение 0");
        }
        else {
            str--;
            row--;
            float min = array[str][0];
            float max = array[0][row];
            for (int j = 0; j < m; j++) {
                if (array[str][j] < min) {
                    min = array[str][j];
                }
            }
            for (int i = 0; i < n; i++) {
                if (array[i][row] > max) {
                    max = array[i][row];
                }
            }

            System.out.printf("Максимальный элемент %.1f в столбце %d \n", max, (row + 1));
            System.out.printf("Минимальный элемент %.1f в строке %d \n", min, (str + 1));

        }
    }

}

