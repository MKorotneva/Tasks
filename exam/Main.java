package exam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
     {
        String numS1;
        String numS2;
        int num1=0;
        int num2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        // считываем как строку
        numS1 = sc.nextLine();
        // если введено не целое число, то отбрасываем дробную часть
        // преобразуем в int
        num1=stringToInt(numS1, num1);

        System.out.println("Введите второе целое число: ");
        numS2 = sc.nextLine();
        num2=stringToInt(numS2, num2);

        sc.close();

        System.out.println("Сумма чисел равна: "+ (num1+num2));

        int diff = Math.abs((num1-num2));
        System.out.println("Разница между "+num1+ " и "+num2+" равна "+ diff);
        //  разницу между этими числами (например, разница между 4 и 5 равна 1,
        //  разница между 6 и 1 равна 5)
        // вычисляем как модуль разности чисел

        System.out.println("Ряд чисел от минимального из этих чисел до максимального:");
        if (num1 <= num2) {
            for (int i=num1; i<=num2; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i=num2; i<=num1; i++) {
                System.out.print(i + " ");
            }
        }


    }
// функция преобразования дробного числа (в виде строки String) в целое int
// на входе строка, проверяется на наличие разделителя ","
// строка разбивается на части по разделителю ","
// первая часть строки преобразуется в целое число int
public static int stringToInt(String str, int n) {
    String [] parts=str.split(",");
    if (!(str.indexOf(",")==-1)) {
        n=Integer.parseInt(parts[0]);
        System.out.println("Отбрасываем дробную часть числа. Целое число: "+n);
    }
    else n=Integer.parseInt(str);
    return n;
}
}
