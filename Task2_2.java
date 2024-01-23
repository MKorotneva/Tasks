import java.util.Scanner;


public class Task2_2 {
    // Составить процедуру,"рисующую" на экране
// горизонтальную линию из любого числа символов "*"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество символов");
        int count = sc.nextInt();
        sc.close();

        line(count);
    }

    public static void line(int count) {
        if (count > 0) {
            System.out.print("* ");
            count--;
            line(count);
        }

    }
}
