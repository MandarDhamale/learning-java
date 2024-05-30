package collections.autoboxingandunboxing;

import corejava.accessmodifiers.A;

import java.util.ArrayList;

class IntWrapper {
    public int num;
    public IntWrapper(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(10); //Autoboxing
        numList.add(20); //Autoboxing
        System.out.println(numList.get(0)); //Auto unboxing

        ArrayList<IntWrapper> numList2 = new ArrayList<IntWrapper>();
        numList2.add(new IntWrapper(1)); // boxing
        numList2.add(new IntWrapper(2)); // boxing
        System.out.println(numList2.get(0));
        System.out.println(numList2.get(0).getNum()); // unboxing
        System.out.println(numList2.get(1).getNum()); // unboxing

        //How autoboxing works behind the scene
        ArrayList<Double> numList3 = new ArrayList<Double>();
        numList3.add(Double.valueOf(33));
        System.out.println(numList3.get(0).doubleValue());


    }
}
