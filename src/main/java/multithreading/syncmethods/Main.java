package multithreading.syncmethods;

class Brackets {
   synchronized public void generate() {
        for (int i = 0; i <= 20; i++) {
            if (i <= 10) {
                System.out.print('[');
            } else {
                System.out.print(']');
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Brackets b = new Brackets();

        //thread 1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    b.generate();
                }
            }
        }).start();

        //thread 2
        //thread1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    b.generate();
                }
            }
        }).start();


    }
}
