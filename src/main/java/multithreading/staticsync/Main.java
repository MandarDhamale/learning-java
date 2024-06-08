package multithreading.staticsync;

class Brackets {
    private Object lock = "lock"; //this is the recommended way to use synchronization blocks
    synchronized public void generate() throws InterruptedException {
        synchronized (lock){
            for (int i = 0; i <= 20; i++) {
                Thread.sleep(5);
                if (i <= 10) {
                    System.out.print('[');
                } else {
                    System.out.print(']');
                }
            }
        }
            System.out.println();
    }
}

// apprx. 3000ms for sync method
// apprx. 2000ms for sync block
// we can improve the performance of the code by synchronizing only the specific blocks which are required

public class Main {
    public static void main(String[] args) {
        Brackets b = new Brackets();
        Brackets b2 = new Brackets();

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
                        b2.generate();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
            }
        }).start();
    }
}