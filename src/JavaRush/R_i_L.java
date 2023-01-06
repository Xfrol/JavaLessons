package JavaRush;

import java.util.ArrayList;

public class R_i_L {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        for (int i = 0; i < strings.size(); i++) {

            System.out.println(strings.get(i));
        }
        return strings;
    }
}
