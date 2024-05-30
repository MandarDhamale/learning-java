package collections.comparable;

import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
    private String name;

    //Constructor
    public Name(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        if(name.length() == o.name.length()){
            return 0;
        }else if(name.length() > o.name.length()){
            return 1;
        }else {
            return -1;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        List names = new LinkedList<>();
        names.add(new Name("Mandar"));
        names.add(new Name("Makarand"));
        names.add(new Name("Priyal"));
        names.add(new Name("Tom"));

        System.out.println(names);
        names.sort(null);
        System.out.println(names);

    }
}
