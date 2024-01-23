public class Task3_2 {
    // Напечатать числа следующим образом:
    //25 25.5 24.8
    //26 26.5 25.8 ...
    //35 35.5 34.8
    public static void main(String[] args) {
        for (int i=25; i<=35; i++) {
            System.out.println(i+" "+ (i+0.5)+" "+ (i-1)+".8");
        }
    }

}
