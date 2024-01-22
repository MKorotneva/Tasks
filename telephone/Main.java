package telephone;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // телефонная книга tBook реализована как список (динамический массив)
    static ArrayList<Contact> tBook = new ArrayList<>(10);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Новый контакт\n" + "2. Редактировать контакт\n" + "3. Удалить контакт\n" + "4. Выйти");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    // При выборе команды Новый контакт пользователю предлагается создать новый
                    // контакт через ввод данных в терминале
                    if (tBook.size() < 10) {
                        Contact contact = new Contact();
                        contact.input();

                        tBook.add(contact);
                        System.out.println("Заполнено: " + tBook.size() + " из 10");
                        tBookPrint();

                    } else {
                        System.out.println();
                        System.out.println("ПАМЯТЬ  ТЕЛЕФОНА  ЗАПОЛНЕНА");
                        tBookPrint();
                    }
                    break;


                case 2:
                    // При выборе команды Редактировать контакт пользователю предлагается
                    // выбрать контакт по его индексу в массиве и затем ввести новое имя и номер.
                    if (!tBook.isEmpty()) {
                        tBookPrint();
                            System.out.println("Какой контакт будем редактировать?:");
                            int indContact;
                            indContact = sc.nextInt();

                            while ((indContact<=0)||(indContact>tBook.size())) {
                                System.out.println("Некорректное значение индекса. \n" + "Введите значение в диапазоне от 1 до " + tBook.size());
                                System.out.println("Какой контакт будем редактировать?:");
                                indContact = sc.nextInt();
                            }
                            Contact contactNew = new Contact();
                            contactNew.input();
                            tBook.set(indContact - 1, contactNew);
                            tBookPrint();
                            }

                    else tBookPrint();


                    break;
                case 3:
                    // При выборе команды Удалить контакт пользователю предлагается выбрать
                    // контакт по его индексу в массиве для удаления.
                    if (!tBook.isEmpty()) {
                       tBookPrint();

                        System.out.println("Какой контакт будем удалять?:");
                        int indContact;
                        indContact = sc.nextInt();
                        while ((indContact<=0)||(indContact>tBook.size())) {
                            System.out.println("Некорректное значение индекса. \n" + "Введите значение в диапазоне от 1 до " + tBook.size());
                            System.out.println("Какой контакт будем удалять?:");
                            indContact = sc.nextInt();
                        }

                        tBook.remove(indContact - 1);
                        tBookPrint();

                    } else tBookPrint();

                    break;
                case 4:
                    // Программа не завершается, пока пользователь не выберет пункт «Выйти».
                                    {
                    System.out.println("Выходим");
                    tBookPrint();
                    }

                    break;
                default:
                    // Введен несуществующий пункт меню, повторный ввод
                    System.out.println("Введен несуществующий пункт меню. Введите 1, 2, 3 или 4");
                    break;
            }
        }
        while (menu != 4);
        sc.close();
    }
    // вывод в консоль динамического списка телефонная книга tBook
    public static void tBookPrint() {
        System.out.println("Телефонная книга:");
        // если уже есть контакты в телефонной книге, то выводим их на экран в формате
        // index. name  value
        if (!tBook.isEmpty()) {
        int index=1;
        for (Contact cont : tBook) {
        System.out.print(index+". ");
        cont.print();
        index++; }
        }
        // Если не вводились контакты, телефонная книга пустая
        else System.out.println("ПАМЯТЬ ТЕЛЕФОНА ПУСТА");
    }
}



