package multithreading.deadlock;

public class Test {
    public static void main(String[] args) {

        boolean flag1 = true;
        boolean flag2 = true;

        if(flag1 && flag2){
            System.out.println("flag1: " + flag1);
            System.out.println("flag2: " + flag2);
        }
    }
}
