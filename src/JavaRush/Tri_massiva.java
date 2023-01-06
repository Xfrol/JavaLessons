package JavaRush;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tri_massiva {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            numbers.add(x);
            if(x%2 == 0 && x%3 == 0){
                divBy3.add(x);
                divBy2.add(x);
            }
            else if (x % 3 == 0) {
                divBy3.add(x);
            } else if (x % 2 == 0) {
                divBy2.add(x);
            } else if (x%3 != 0 && x%2 != 0) {
                others.add(x);
            }
        }

        Tri_massiva.printList(divBy3);
        Tri_massiva.printList(divBy2);
        Tri_massiva.printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
