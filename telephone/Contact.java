package telephone;
import java.util.Scanner;

// Контакт: имя, номер телефона
public class Contact {
    public String name;
    public String value;

    // вывод в консоль объекта Contact
    public void print () {
        System.out.println(name + " тел. "+ value);
    }

    // ввод информации в объект Contact
    public void input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        this.name = sc.nextLine();
        // проверка на пустое значение, повторный ввод до непустого значения
        while (this.name.isBlank()) {
            System.out.println("Имя не может быть пустым.");
            System.out.println("Введите имя еще раз: ");
            this.name = sc.nextLine();
        }
        System.out.println("Введите номер: ");
        this.value = sc.nextLine();
        // проверка на пустое значение, повторный ввод до непустого значения
        while (this.value.isBlank()) {
            System.out.println("Номер не может быть пустым.");
            System.out.println("Введите номер еще раз: ");
            this.value = sc.nextLine();
        }

    }
}
