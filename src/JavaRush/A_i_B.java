package JavaRush;

public class A_i_B {

    public static void main(String[] args) {
        System.out.println(add(5, 0)); // 5+0=5
        System.out.println(add(6, 18)); // 6+18=24
        System.out.println(add(53, 148)); // 53+148=201
        System.out.println(add(236, 4667)); // 236+4667=4903
    }

    public static String add(int a, int b) {
        return a +"+" +b + "=" + (a + b);
    }
}
