package It_Cot.lesson9;

public class Robot {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private String name;
    private int age;
    private int power;

    public boolean fight(Robot anotherRobot){

        return (anotherRobot.getPower() < this.power);

    }

}
