package phone;

public class Main {
    public static void main (String [] Args) {
        Phone p1 = new Phone("+79173433333", "iPhone", 0.5);
        System.out.println("Телефон: номер "+p1.getNumber()+" модель: "+p1.model+" вес: "+ p1.weight);
        p1.receiveCall("Жорж Милославский");
        System.out.println ();

        Phone p2 = new Phone("+801235555555", "Samsung", 0.6);
        System.out.println("Телефон: номер "+p2.getNumber()+" модель: "+p2.model+" вес: "+ p2.weight);
        p2.receiveCall("Hatsune Miku");
        System.out.println ();

        Phone p3 = new Phone();
        p3.setNumber("+012311111111");
        p3.setModel("Poco");
        p3.setWeight(0.35);
        System.out.println("Телефон: номер "+p3.getNumber()+" модель: "+p3.model+" вес: "+ p3.weight);
        p3.receiveCall("Joe Biden");




    }
}
