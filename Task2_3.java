import java.util.Scanner;

public class Task2_3 {
// Даны стороны двух треугольников.
// Найти сумму их периметров и сумму их площадей.
// (Определить процедуру для расчета периметра и площади треугольника по
// его сторонам.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны первого треугольника");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Введите стороны второго треугольника");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        sc.close();
        // проверка существования первого треугольника
        if ((triangle (a1,b1,c1)) & (notNull (a1,b1,c1))) {
            System.out.printf("Первый треугольник со сторонами %d %d %d существует \n", a1, b1, c1);
        } else {
            System.out.printf("Первый треугольник со сторонами %d %d %d не существует \n", a1, b1, c1);
        }
        // проверка существования второго треугольника
        if ((triangle (a2,b2,c2)) & (notNull (a2,b2,c2))) {
            System.out.printf("Второй треугольник со сторонами %d %d %d существует \n", a2,b2, c2);
        } else {
            System.out.printf("Второй треугольник со сторонами %d %d %d не существует \n", a2, b2, c2);
        }
        // если оба треугольника существуют, то вычисляем
        if ((triangle (a1,b1,c1)) & (triangle (a2,b2,c2)) & (notNull (a1,b1,c1)) &(notNull (a2,b2,c2))) {
            int p1 = perimetr (a1, b1, c1);
            int p2 = perimetr (a2, b2, c2);
            System.out.println();
            System.out.print("Периметр первого: "+p1+"  ");
            System.out.print("Периметр второго: "+p2+" ");
            System.out.println("Сумма периметров: " +(p1+p2));
            double s1 = square (a1, b1, c1);
            double s2 = square (a2, b2, c2);
            System.out.printf("Площадь первого: %.4f ", s1);
            System.out.printf("Площадь второго: %.4f ",s2);
            System.out.printf("Сумма площадей: %.4f ", (s1+s2));
        }

    }
    // проверка существования треугольника с заданными сторонами
    public static boolean triangle (int a, int b, int c) {
        if ((a+b)>c)
            return true;
        else
            return false;
    }
    // вычисление периметра
    public static int perimetr (int a, int b, int c) {
           return a+b+c;
    }
    // вычисление площади
    public static double square (int a, int b, int c) {
        double pp = perimetr(a, b, c)/2.0 ;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
// проверка ненулевых сторон треугольника
    public static boolean notNull (int a, int b, int c) {
        if ((a>0) & (b>0) & (c>0))
            return true;
        else return false;
    }
}
