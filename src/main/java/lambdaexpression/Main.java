package lambdaexpression;

interface Lambda {
    public void demo();

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
            System.out.println("Statement 02lm");
            System.out.println("Statement 03lm");
        });

        lambda.demo();
        lambda2.demo();



    }

}
