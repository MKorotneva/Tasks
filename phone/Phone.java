package phone;

public class Phone {
    // содержит переменные number, model и weight
    private String number;
    String model;
    double weight;
    // метод receiveCall, имеет один параметр – имя
    //звонящего. Выводит на консоль сообщение “Звонит {name}”
    public void receiveCall (String nameCalling) {
        System.out.println("Звонит "+nameCalling);
    }
    // метод getNumber – возвращает номер телефона
    public String getNumber () {
        return number;
    }
    public void setNumber (String number) {
        this.number=number;
    }
    public void setModel (String model) {
        this.model=model;
    }
    public void setWeight (double weight) {
        this.weight=weight;
    }
    public Phone() {
    }
    public Phone(String number, String model, double weight) {
        this.number=number;
        this.model=model;
        this.weight=weight;
    }

}
