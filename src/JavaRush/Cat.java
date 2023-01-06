package JavaRush;

public class Cat extends Animal {

    String tail = "НЕ СТАТИК Cat";

    static int catsCount = 37;

    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)"); //11
        System.out.println("Текущее значение статической переменной catsCount = " + catsCount);   //12
        System.out.println("Текущее значение tail = " + this.tail); //13
        this.tail = tail; //14
        System.out.println("Текущее значение tail = " + this.tail);   //15
    }

    public static void main(String[] args) {
        Cat cat = new Cat("НЕ СТАТИК Мозг", "НЕ СТАТИК Сердце", "НЕ СТАТИК Хвост");
    }
}