package JavaRush;

import java.util.HashSet;
import java.util.Set;

public class Vu_ne_Podhodite {

    public static Set<Integer> createSet() {
        // напишите тут ваш код
      Set<Integer> set = new HashSet<>();
      set.add(10);
      set.add(2);
      set.add(1);
      set.add(5);
      set.add(64);
      set.add(11);
      set.add(84);
      set.add(8);
      set.add(94);
      set.add(21);
      set.add(90);
      set.add(16);
      set.add(27);
      set.add(18);
      set.add(59);
      set.add(6);
      set.add(13);
      set.add(89);
      set.add(43);
      set.add(9);

      return set;

    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(o -> o >10);

    }

    public static void main(String[] args) {
     Set<Integer> set = createSet();
        removeAllNumbersGreaterThan10(set);
        System.out.println(set);


    }
}
