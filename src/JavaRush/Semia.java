package JavaRush;

public class Semia {

    public static void main(String[] args) {
        // напишите тут ваш код
        Human human1 = new Human("Ivan", true, 34);
        Human human2 = new Human("Julianna", false, 35);
        Human human3 = new Human("Oleg", true, 66);
        Human human4 = new Human("Raisa", false, 51);
        Human human_1 = new Human("Ivan", true, 34, human3, human4);
        Human human_2 = new Human("Julianna", false, 34, human3, human4);
        Human human_3 = new Human("Nikolay", true, 30, human3, human4);
        Human human_4 = new Human("Anna", false,26, human3, human4);
        Human human_5 = new Human("Maria", false,20, human3, human4);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human_1);
        System.out.println(human_2);
        System.out.println(human_3);
        System.out.println(human_4);
        System.out.println(human_5);
    }

    public static class Human {

        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public  Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
