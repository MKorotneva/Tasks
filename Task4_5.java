import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        // Дан массив. Определить:
        //1. количество максимальных элементов в массиве;
        //2. количество минимальных элементов в массиве
        System.out.println("Введите длину массива:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float [] array = new float[n];
        System.out.println("Введите "+n+" элементов массива (положительные, отрицательные, целые, дробные)");
    // считывание массива
        for (int i=0; i<n; i++) {
        array[i] = sc.nextFloat();
        }
        sc.close();
        // первый элемент массива принимаем за максимальный и минимальный
        float max = array[0];
        float min = array[0];
        // поиск максимального и минимального элемента
        for (int i=0; i<n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // в массиве array длиной n ищем значения, равные max или min
        int qMax = valCount (array, n, max);
        int qMin = valCount (array, n, min);

        System.out.printf("Максимальный элемент %.1f встречается %d раз \n",max, qMax);
        System.out.printf("Минимальный элемент %.1f встречается %d раз \n",min, qMin);

    }
    // функция подсчета количества значений val в массиве array
    public static int valCount (float [] array, int n, float val) {
        int vc = 0;
        for (int i=0; i<n; i++) {
            if (array[i] == val) {
            vc++;
            }
        }
        return vc;
    }
}
