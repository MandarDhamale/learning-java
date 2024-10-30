package lambdaexpression.thread;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1");
            }
        });

        thread.start();

        Thread thread2 = new Thread(()-> System.out.println("Thread2 - lm"));
        thread2.start();
        
    }
}
