import java.util.Scanner;

public class Task3_1 {
    // Составить программу вывода любого числа любое заданное число раз
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для печати");
        int n = sc.nextInt();
        System.out.println("Сколько раз его напечатать?");
        int q = sc.nextInt();
        sc.close();
        for (int i=1; i<=q; i++) {
            System.out.println(n);
        }
    }
}
