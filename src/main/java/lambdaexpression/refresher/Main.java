package lambdaexpression.refresher;

interface Data{
    float demo();
}

interface Data2{
    float demo(int x, float y);
}

public class Main {
    public static void main(String[] args) {

        Data data = () -> {
            int a = 1;
            System.out.println("Statement" + a);
            return 100;
        };

        Data2 data2 = (a, b) -> {
            System.out.println("Value of 1st parameter: " + a);
            System.out.print("Value of 2nd paramter will be returned by the method: ");
            return b;
        };



        System.out.println(data.demo());
        System.out.println(data2.demo(1,2));



    }
}
