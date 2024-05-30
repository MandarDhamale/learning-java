package multithreading.creatingthreads;

import static java.lang.Thread.sleep;

class MyCounter extends Thread{
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run(){
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public void countMe() throws InterruptedException{
        for(int i=0; i<10; i++){
            sleep(500);
            System.out.println("Thread No.: " + threadNo + " Iteration No.: " + i);
        }
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        MyCounter counter3 = new MyCounter(3);

        long starTime = System.currentTimeMillis();

        counter1.start();
        System.out.println("**************************************");
        counter2.start();
        counter3.start();

        sleep(10000);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - starTime;
        System.out.println("Total Execution time: " + executionTime);

    }
}
