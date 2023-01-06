package JavaRush;

import java.util.HashMap;
import java.util.Map;

public class Odinakovue_imia_familii {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
       Map<String, String> map = new HashMap<>();
       map.put("Stavrogin", "Ivan");
       map.put("Mustafin", "Nikolay");
       map.put("Nosov", "Aleksey");
       map.put("Ivanov", "Sergey");
       map.put("Krylov", "Ivan");
       map.put("Kirkorov", "Philipp");
       map.put("Kravchenko", "Ihor");
       map.put("Lomov", "Artem");
       map.put("Hnatko", "Artem");
       map.put("Naumov", "Sergey");
       return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String,String> string: map.entrySet()){
            String key = string.getKey();
         if(key.equals(name)){
             count++;
         }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String,String> string: map.entrySet()){

            if(string.getValue().equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
