import java.util.Scanner;

//@formatter:on
public class Task2 {
    // Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга и сторону квадрата");
        double RadiusCircle = sc.nextInt();
        double LengthSq = sc.nextInt();
        sc.close();
        double CircleSq = Math.PI * Math.pow(RadiusCircle, 2);
        double SquareSq = Math.pow(LengthSq, 2);
        System.out.printf("Площадь круга: %.2f \n", CircleSq);
        System.out.printf("Площадь квадрата: %.2f \n", SquareSq);
        if (CircleSq > SquareSq) {
            System.out.println("Площадь круга больше");
        } else if (CircleSq < SquareSq) {
            System.out.println("Площадь квадрата больше");
        } else {
            System.out.println("Площади равны");
        }
    }

}
