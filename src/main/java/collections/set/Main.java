package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

//        Main.method1();
//        Main.method2();
        Main.method3();


    }

    public static void method1(){
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("D");
        set.add("B");
        set.add("C");
        System.out.println(set);
        System.out.println(set.contains("AB"));
    }

    public static void method2(){
        Set set = new HashSet();

        // order is not guaranteed in sets
        for(int i=30; i>0; i--){
            set.add("X"+i);
        }

        System.out.println(set);

    }

    public static void method3(){
        Set set = new TreeSet();

        for(int i=30; i>0; i--){
            set.add("X"+i);
        }

        for(Object o: set){
            System.out.println(o);
        }




    }


}
