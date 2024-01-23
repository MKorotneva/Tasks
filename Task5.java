import java.util.Scanner;

public class Task5 {
    //Даны два числа.
    // Если квадратный корень из второго числа меньше первого числа,
    // то увеличить второе число в пять раз
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();
        // квадратный корень из второго числа
        double sb = Math.sqrt(b);
        System.out.println("Корень квадратный из " + b + " равен " + sb);
        // проверка условия
        if (sb < a) {
            b = 5*b;
            System.out.println("Второе число увеличили в 5 раз: " + b);
        } else {
            System.out.println("Второе число " + b + " не изменено");
        }
    }

}
