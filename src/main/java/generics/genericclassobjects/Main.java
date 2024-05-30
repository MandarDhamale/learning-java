package generics.genericclassobjects;

import java.util.LinkedList;
import java.util.List;

class Data<T> {
    private T obj;

    public Data(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<>("ABC"));
//        elements.add(new Data<>(123));
//        elements.add(new Data<>('$'));
//        elements.add(new Data<>(123.123));


        for (Data<String> o : elements) {
            System.out.println(o);
        }


    }
}
