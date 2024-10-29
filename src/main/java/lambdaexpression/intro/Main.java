package lambdaexpression.intro;

interface Lambda {
    void demo();
//    void demo2(); When two abstract methods are implemented you cannot use lambda function, lambda functions are used with functional interface
}


public class Main {

    public static void main(String args[]){

        Lambda lambda = new Lambda() {
            @Override
            public void demo() {
                System.out.println("Statement 01");
            }
        };

        Lambda lambda2 = (()-> {
            System.out.println("Statement 02le");
            System.out.println("Statement 03le");
        });

        lambda.demo();
        lambda2.demo();

    }
}
