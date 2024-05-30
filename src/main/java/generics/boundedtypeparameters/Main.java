package generics.boundedtypeparameters;

import java.util.LinkedList;
import java.util.List;

class Data<K extends Integer, V extends Name> {
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
        return "Data{" + "key=" + key + ", value=" + value + '}';
    }

    public <N extends Number, E extends String> void display(N number, E element) { //bounded type parameter

        System.out.println(number + " - " + element);
    }
}


class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Data<Integer, Name> data = new Data<>(1, new Name("Mandar"));
        System.out.println(data);
        data.display(10, "Messi");
        data.display(7, "Ronaldo");

    }
}

