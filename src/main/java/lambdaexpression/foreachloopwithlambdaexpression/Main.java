package lambdaexpression.foreachloopwithlambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Data{

    private String name;

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
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//
//        for(int x: list){
//            System.out.println(x);
//        }
//
//        list.forEach(a -> System.out.println(a));

        List<Data> data = Arrays.asList(new Data("Mandar"), new Data("Vijaya"), new Data("Manik"));
        Collections.sort(data, (a,b) -> b.getName().compareTo(a.getName()));
        data.forEach(a -> System.out.println(a));

    }
}
