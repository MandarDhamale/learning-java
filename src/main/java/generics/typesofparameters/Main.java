package generics.typesofparameters;

import java.util.LinkedList;
import java.util.List;

class Data<K, V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        List<Data<String, Integer>> data = new LinkedList<>();
        data.add(new Data<>("A", 1));
        data.add(new Data<>("B", 2));
        System.out.println(data);
    }
}
