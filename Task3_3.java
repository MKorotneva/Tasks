public class Task3_3 {
    // Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
    // для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
    public static void main(String[] args) {
        for (int f=1; f<=10; f++) {
        double k=(f*0.453);
        System.out.print(f+" фунт(ов) -> ");
        System.out.printf("%.3f",k);
        System.out.println(" кг");
        }
    }
}
