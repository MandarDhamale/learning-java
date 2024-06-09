package multithreading.countdownlatch;

/*

 There are five steps of deploying a software application

    1. Requirement Gathering and Analysis
    2. System Architecture and Design
    3. Development and Unit Testing
    4. Integration and System Testing
    5. User Acceptance Testing (UAT) and Bug Fixing

*/

import java.util.concurrent.CountDownLatch;

public class DeploySoftware extends Thread {

    private String step;
    private CountDownLatch latch;

    public DeploySoftware(CountDownLatch latch, String step) {
        this.latch = latch;
        this.step = step;
    }

    @Override
    public void run(){

        System.out.println(step);
        latch.countDown();

    }
}

class Software{
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(5);
        DeploySoftware s1 = new DeploySoftware(latch, "[COMPLETED] 1. Requirement Gathering and Analysis");
        DeploySoftware s2 = new DeploySoftware(latch, "[COMPLETED] 2. System Architecture and Design");
        DeploySoftware s3 = new DeploySoftware(latch, "[COMPLETED] 3. Development and Unit Testing");
        DeploySoftware s4 = new DeploySoftware(latch, "[COMPLETED] 4. Integration and System Testing");
        DeploySoftware s5 = new DeploySoftware(latch, "[COMPLETED] 5. User Acceptance Testing (UAT) and Bug Fixing");

        s1.start();
        s1.join();

        s2.start();
        s2.join();

        s3.start();
        s3.join();

        s4.start();
        s4.join();

        s5.start();
        s5.join();



        latch.await();
        deploySoftwareToProd();

    }

    public static void deploySoftwareToProd(){
        System.out.println("Software deployed to production");
    }

}