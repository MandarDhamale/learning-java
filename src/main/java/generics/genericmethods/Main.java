package generics.genericmethods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Data{
    public <E> void printListData(List<E> list){
        for (E value: list){
            System.out.println(value);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<String> list2 = new LinkedList<>();
        list2.add("ABC");
        list2.add("DEF");
        list2.add("GHI");

        new Data().printListData(list1); //anonymous object
        new Data().printListData(list2); //anonymous object

    }
}
