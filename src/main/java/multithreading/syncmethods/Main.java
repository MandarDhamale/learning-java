package multithreading.syncmethods;

class Brackets {
    synchronized public void generate() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            Thread.sleep(5);
            if (i <= 10) {
                System.out.print('[');
            } else {
                System.out.print(']');
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(10);
        }
        
    }
}

public class    Main {
    public static void main(String[] args) {
        Brackets b = new Brackets();

        //thread 1
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 5; i++) {
                    try {
                        b.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                synchronized (this) {
                    System.out.println("Time(thread1): " + totalTime);
                }
            }
        }).start();

        //thread 2
        //thread1
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 5; i++) {
                    try {
                        b.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
               synchronized (this){
                   System.out.println("Time(thread2): " + totalTime);
               }
            }
        }).start();
    }
}
