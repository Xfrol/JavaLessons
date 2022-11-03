package It_Cot.lesson11;

public class Human {
    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

    }

    @Override
    public String toString() {
        String sex;
        if (this.sex == true){
           sex = "мужской";
        }
        else {
            sex = "женский";
        }
        return "Имя: " + name + ", пол: " + sex + ", возраст: " + age + ", отец: " + father.name + ", мать: " + mother.name;
    }

    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;

    public static void main(String[] args) {
        Human grandFather1 = new Human("Иван", true, 76);
        Human grandFather2 = new Human("Василий", true, 75);
        Human grandMother1 = new Human("Клавдия", false, 70);
        Human grandMother2 = new Human("Клавдия", false,70);
        Human father = new Human("Олег", true, 55);
        Human mother = new Human("Раиса", false, 48);
        Human son = new Human("Иван", true, 34);
        Human daughter = new Human("Юлианна", false, 36);

        father.father = grandFather2;
        father.mother = grandMother2;
        mother.father = grandFather1;
        mother.mother = grandMother1;
        son.father = father;
        son.mother = mother;
        daughter.father = father;
        daughter.mother = mother;

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println();


    }
}

