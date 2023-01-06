package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Samoe_Bolshoe_chislo {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int i = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            integers.add(number);
        }
        System.out.println(Collections.max(integers));
    }
}
