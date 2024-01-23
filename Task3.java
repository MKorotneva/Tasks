import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Дано двузначноечисло.
        // Определить:остаток от деления десятков на единицы,
        // результат деления единиц на десятки
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число");
        int Num = sc.nextInt();
        sc.close();
        int Ed = Num % 10;
        System.out.println("Единицы: " + Ed);
        int Des = Num / 10;
        System.out.println("Десятки: " + Des);

        System.out.println("Остаток от деления десятков на единицы: " + Des % Ed);
        System.out.println("Результат от деления единиц на десятки: " + Ed / Des);
    }
}
