package JavaRush;

public class Man_Woman {



    public static void main(String[] args) {
        Man man1 = new Man("Ivan", 33, "Kyiv");
        Man man2 = new Man("Oleg", 55, "Kherson");
        Woman woman1 = new Woman("Raisa", 50, "Odessa");
        Woman woman2 = new Woman("Julianna", 34, "Malaga");
        System.out.println(man1);
    }


  public static class Man{
       private String name;
       private int age;
       private String address;

      @Override
      public String toString(){
          return name + " " + age + " " + address;
      }

       public Man(String name, int age, String address){
           this.name = name;
           this.age = age;
           this.address = address;

       }
  }
  public static class Woman{
      private String name;
      private int age;
      private String address;

      @Override
      public String toString(){
          return name + " " + age + " " + address;
      }

      public Woman(String name, int age, String address){
          this.name = name;
          this.age = age;
          this.address = address;

      }

  }


}
