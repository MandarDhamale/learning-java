package corejava.abstraction;

public class Main {

    public static void main(String[] args) {
        Person mak = new Makarand();
        System.out.println(mak.speak());
        System.out.println(mak.walk());

       Person person = new Person() {
           @Override
           public String speak() {
               return super.speak();
           }

           @Override
           public String walk() {
               return super.walk();
           }
       };

        System.out.println(person.speak());
        System.out.println(person.walk());


    }

}
