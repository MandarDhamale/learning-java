package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    private String name;

    public SomeThread(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(name + " started");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " ended");
    }



}


public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        SomeThread st1 = new SomeThread("thread1");
        SomeThread st2 = new SomeThread("thread2");
        SomeThread st3 = new SomeThread("thread3");
        SomeThread st4 = new SomeThread("thread4");
        SomeThread st5 = new SomeThread("thread5");


        //traditional way of executing threads
//        st1.start();
//        st2.start();
//        st3.start();
//        st4.start();
//        st5.start();

        //using executor service method
        executorService.execute(st1);
        executorService.execute(st2);
        executorService.execute(st3);
        executorService.execute(st4);
        executorService.execute(st5);

        executorService.shutdown();

    }



}
