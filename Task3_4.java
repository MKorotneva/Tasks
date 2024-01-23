import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
// Вычислить сумму 1+1/2+1/3+...+1/n
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        sc.close();
        double sum= 0;
        for (int i=1; i<=n; i++) {
            sum = sum + (1.0/i);
        }
        System.out.printf("Сумма 1+1/2+1/3+...+1/n равна %.3f", sum);
    }
}
