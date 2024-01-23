public class Task2_4 {
    // Напечатать числа в виде следующей таблицы:
    // 1 2...10
    // 1 2...10
    // 1 2...10
    // 1 2...10
    public static void main(String[] args) {
        int count =1;
        line(count);
        System.out.println();
        line(count);
        System.out.println();
        line(count);
        System.out.println();
        line(count);
    }

    public static void line(int count) {
        if (count <=10) {
            System.out.print(count +" ");
            count ++;
            line(count);
        }

    }
}
