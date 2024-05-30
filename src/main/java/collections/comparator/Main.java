package collections.comparator;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K extends Integer, V extends String>{
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

class COMPARE_KEY implements Comparator<Data<Integer, String>>{

    // reverse order sorting
    @Override
    public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
        if(o1.getKey() > o2.getKey())
            return -1;
        else if(o1.getKey() < o2.getKey())
            return  1;
        else
            return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        COMPARE_KEY ck = new COMPARE_KEY();
        Main.treeSet(ck);


    }
    public static void hashSet(){
        Set<Data<Integer,String>> set = new HashSet<>();
        set.add(new Data<>(1, "A"));
        set.add(new Data<>(2, "B"));
        set.add(new Data<>(4, "D"));
        set.add(new Data<>(3, "C"));
        set.add(new Data<>(5, "A")); // notice it allow duplicate here, usually set does not allow duplicate values

        System.out.println(set);
    }

    public static void treeSet(COMPARE_KEY compareKey){
        Set<Data<Integer,String>> set = new TreeSet<>(compareKey);
        set.add(new Data<>(1, "A"));
        set.add(new Data<>(2, "B"));
        set.add(new Data<>(4, "D"));
        set.add(new Data<>(3, "C"));
        set.add(new Data<>(5, "Y")); // notice it allow duplicate here, usually set does not allow duplicate values
        set.add(new Data<>(5, "Z"));

        System.out.println(set);

    }


}
