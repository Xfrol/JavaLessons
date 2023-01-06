package JavaRush;

public class Desiat_konstryktorov {

    public static class Human{
        String name;
        String last_name;
        int age;
        int weight;
        int hight;
        String eyes_color;


        public Human(String name){
          this.name = name;
        }
        public Human(String name, String last_name){
            this.name = name;
            this.last_name = last_name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(int age, int hight){
            this.age = age;
            this.hight = hight;
        }
        public Human(){

        }
        public Human(String last_name, int age, String name){
            this.last_name = last_name;
            this.age = age;
            this.name = name;
        }
        public Human(String name, String last_name, int age, int weight, int hight){
            this.name = name;
            this.last_name = last_name;
            this.age = age;
            this.weight = weight;
            this.hight = hight;
        }
        public Human(int age, int weight, int hight){
            this.age = age;
            this.weight = weight;
            this.hight = hight;
        }
        public Human(int age){
            this.age = age;
        }
        public Human(int age, String name){
            this.age = age;
            this.name = name;
        }


    }

}
