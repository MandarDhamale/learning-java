package collections.set;

import java.util.*;

class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Name{" + "name='" + name + '\'' + '}';
    }


    @Override
    public int compareTo(Name n) {
        return name.compareTo(n.getName());
    }
}

public class Conversion {
    public static void main(String[] args) {

        Set<Name> set = new HashSet<>();
        set.add(new Name("mandar"));
        set.add(new Name("makarand"));
        set.add(new Name("vijaya"));

        List<Name> list = new ArrayList<>();
        list.addAll(set);

        System.out.println(list);
        System.out.println(Collections.binarySearch(list, new Name("mandar")));


    }
}
