package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Desiat_Strochek_v_Nachalo_Spiska {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i -1;
            System.out.println(list.get(j));
        }
    }
}
