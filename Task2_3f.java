import java.util.Scanner;

public class Task2_3f {
// Даны стороны двух треугольников.
// Найти сумму их периметров и сумму их площадей.
// (Определить процедуру для расчета периметра и площади треугольника по
// его сторонам.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны первого треугольника");
        float a1 = sc.nextFloat();
        float b1 = sc.nextFloat();
        float c1 = sc.nextFloat();
        System.out.println("Введите стороны второго треугольника");
        float a2 = sc.nextFloat();
        float b2 = sc.nextFloat();
        float c2 = sc.nextFloat();
        sc.close();
        // проверка существования первого треугольника
        if ((triangle (a1,b1,c1)) & (notNull (a1,b1,c1))) {
            System.out.printf("Первый треугольник со сторонами %.2f %.2f %.2f существует \n", a1, b1, c1);
        } else {
            System.out.printf("Первый треугольник со сторонами %.2f %.2f %.2f не существует \n", a1, b1, c1);
        }
        // проверка существования второго треугольника
        if ((triangle (a2,b2,c2)) & (notNull (a2,b2,c2))) {
            System.out.printf("Второй треугольник со сторонами %.2f %.2f %.2f существует \n", a2,b2, c2);
        } else {
            System.out.printf("Второй треугольник со сторонами %.2f %.2f %.2f не существует \n", a2, b2, c2);
        }
        // если оба треугольника существуют, то вычисляем
        if ((triangle (a1,b1,c1)) & (triangle (a2,b2,c2)) & (notNull (a1,b1,c1)) &(notNull (a2,b2,c2))) {
            float p1 = perimetr (a1, b1, c1);
            float p2 = perimetr (a2, b2, c2);
            System.out.println();
            System.out.printf("Периметр первого: %.2f ",p1);
            System.out.printf("Периметр второго: %.2f ", p2);
            System.out.printf("Сумма периметров: %.2f \n",(p1+p2));
            double s1 = square (a1, b1, c1);
            double s2 = square (a2, b2, c2);
            System.out.printf("Площадь первого: %.2f ", s1);
            System.out.printf("Площадь второго: %.2f ",s2);
            System.out.printf("Сумма площадей: %.2f ", (s1+s2));
        }

    }
    // проверка существования треугольника с заданными сторонами
    public static boolean triangle (float a, float b, float c) {
         return (((a+b)>c)&((a+c)>b)&((b+c)>a));
    }
    // вычисление периметра
    public static float perimetr (float a, float b, float c) {
           return a+b+c;
    }
    // вычисление площади
    public static double square (float a, float b, float c) {
        double pp = perimetr(a, b, c)/2.0 ;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
// проверка ненулевых сторон треугольника
    public static boolean notNull (float a, float b, float c) {
        if ((a>0) & (b>0) & (c>0))
            return true;
        else return false;
    }
}
