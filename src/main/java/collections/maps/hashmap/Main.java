package collections.maps.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");

        System.out.println("Iteration method 1");
        for (String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("Iteration method 2");
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("Iteration method 3");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> temp = iterator.next();
            System.out.println(temp.getKey() + ": " + temp.getValue());
        }

    }
}
