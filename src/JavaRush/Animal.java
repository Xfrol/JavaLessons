package JavaRush;

public class Animal {

    String brain = "НЕ СТАТИК Animal";
    String heart = "НЕ СТАТИК Animal";

    public static int animalCount = 7700000;

    public Animal(String brain, String heart) {
        System.out.println("Выполняется конструктор базового класса Animal");             //1
        System.out.println("Были ли уже проинициализированы переменные класса Animal?");  //2
        System.out.println("Текущее значение статической переменной animalCount = " + animalCount); //3
        System.out.println("Текущее значение brain в классе Animal = " + this.brain);  //4
        System.out.println("Текущее значение heart в классе Animal = " + this.heart);  //5
        System.out.println("Были ли уже проинициализированы переменные класса Cat?");  //6
        System.out.println("Текущее значение статической переменной catsCount = " + Cat.catsCount); //7 создат класс-наследник

        this.brain = brain;
        this.heart = heart;
        System.out.println("Конструктор базового класса Animal завершил работу!"); //8
        System.out.println("Текущее значение brain = " + this.brain);  //9
        System.out.println("Текущее значение heart = " + this.heart);  //10
    }
}
