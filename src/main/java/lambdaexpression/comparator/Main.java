package lambdaexpression.comparator;

import java.util.*;

class Data {
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" + "name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {

        List<Data> list = new ArrayList<>();
        list.add(new Data("Mandar"));
        list.add(new Data("Vijaya"));
        list.add(new Data("Manik"));
        list.add(new Data("Tom"));

//        Collections.sort(list, new Comparator<Data>() {
//            @Override
//            public int compare(Data o1, Data o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));

        Collections.sort(list, (a, b) -> {
            if(a.getName().length() < b.getName().length()){
                return 1;
            }else if(a.getName().length() > b.getName().length()){
                return -1;
            }else {
                return 0;
            }
        });



        for (Data d : list) {
            System.out.println(d);
        }

    }
}
