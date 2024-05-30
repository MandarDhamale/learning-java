package corejava.exceptionhandling;

public class Main {
    public static void main(String[] args) {

        System.out.println("Excpetion Handling!");

        Main main = new Main();
//        main.case1(10,0);
//        main.case2(10,0);
        main.case3(10,0);

    }

    public void case1(int x, int y){
        if(y!=0)
            System.out.println("x/y=" + x/y);
        else
            System.out.println("Value of y is 0, a possible exception.");
    }

    public void case2(int x, int y){
        try{
            System.out.println("x/y=" + x/y);
        }catch (Exception e){
            System.out.println("Value of y is 0, a possible exception." + e);
        }
    }

    public void case3(int x, int y){
        y=0;
        try{
            System.out.println("x/y=" + x/y);
        }catch (ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Test output after exception");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("y=" + y);
        }
    }



}
