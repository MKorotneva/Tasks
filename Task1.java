import java.util.Scanner;

//@formatter:on
public class Task1 {
    //В чемпионате по футболу команде за выигрыш дается 3очка,за проигрыш—0,за ничью—1.
    // Известно количество очков,полученных командой за игру.
    // Определить словесный результат игры(выигрыш,проигрыш или ничья)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество очков");
        int score = sc.nextInt();
        sc.close();
        switch (score) {
            case 0:
                System.out.println("Проиграли");
                break;
            case 1:
                System.out.println("Ничья");
                break;
            case 3:
                System.out.println("Выиграли");
                break;
            default:
                System.out.println("Введено несуществующее количество очков. Введите 0, 1 или 3");
                break;
        }
    }
}
