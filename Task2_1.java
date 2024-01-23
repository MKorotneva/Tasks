public class Task2_1 {
    // Составить процедуру,"рисующую" на экране горизонтальную линию
    // из 10 символов "*"
    public static void main(String[] args) {
        line(10);
    }

    public static void line(int count) {
        if (count > 0) {
            System.out.print("* ");
            count --;
            line(count);
        }

    }
}
