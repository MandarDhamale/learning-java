package multithreading.waitandnotify;

public class WithNotify {

    public static int balance = 0;

    synchronized public void withdraw(int amount) {
        if (balance <= 0) {
            System.out.println("[WITHDRAW] Withdrawing amount " + amount);
            System.out.println("[WITHDRAW] Waiting since the current balance is " + balance + " and we are trying to withdraw " + amount);
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("[WITHDRAW] Wait completed");
        }
        balance = balance - amount;
        System.out.println("[WITHDRAW] Complted withdraw of " + amount + " Current Balance: " + balance);
    }

    public void deposit(int amount) {
        synchronized (this) {
            balance = balance + amount;
            System.out.println("[DEPOSIT] Deposit completed of " + amount);
            notify();
        }
    }

    public static void main(String[] args) {
        WithNotify WithNotify = new WithNotify();


        //thread1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int withdraw = 1000;
                WithNotify.withdraw(withdraw);
            }
        });
        thread1.setName("thread1");
        thread1.start();


        //thread2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int deposit = 10000;
                WithNotify.deposit(deposit);
            }
        });
        thread1.setName("thread2");
        thread2.start();


    }
}