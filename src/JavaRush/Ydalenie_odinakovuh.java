package JavaRush;

import java.util.HashMap;
import java.util.Map;

public class Ydalenie_odinakovuh {

    public static Map<String, String> createMap() {
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map <String, String> copy = new HashMap<>(map);
        for(String name: copy.values()){
            int count = 0;
            for(String nameTmp: map.values()){
                if(nameTmp.equals(name)){
                    count++;
                }
                if(count > 1){
                    removeItemFromMapByValue(map, name);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
