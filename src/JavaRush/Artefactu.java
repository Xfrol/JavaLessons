package JavaRush;

public class Artefactu {

    int countNumber;
    public String culture;
    public int age;
    static int count = 1;

    public Artefactu(int countNumber){
       this.countNumber = count++;
    }
    public Artefactu(int countNumber, String culture){
        this.countNumber = count++;
        this.culture = culture;
    }
    public Artefactu(int countNumber, String culture, int age){
        this.countNumber = count++;
        this.culture = culture;
        this.age = age;
    }

    public static void main(String[] args) {

        Artefactu artefact = new Artefactu(10);
        Artefactu artefact2 = new Artefactu(20, "Aztec");
        Artefactu artefact3 = new Artefactu(30, "Skifs", 4);

        System.out.println(artefact.countNumber);
        System.out.println(artefact2.countNumber + " "+ artefact2.culture);
        System.out.println(artefact3.countNumber);
    }




}
