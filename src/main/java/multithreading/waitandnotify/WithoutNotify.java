package multithreading.waitandnotify;

public class WithoutNotify {

    public static int balance = 0;

    synchronized public void withdraw(int amount) throws InterruptedException {
        if (balance <= 0) {
            System.out.println("[WITHDRAW] Withdrawing amount " + amount);
            System.out.println("[WITHDRAW] Waiting for 5s since the current balance is " + balance + " and we are trying to withdraw " + amount);
            wait(5000);
            System.out.println("[WITHDRAW] 5s wait completed");
        }
        balance = balance - amount;
        System.out.println("[WITHDRAW] Complted withdraw of " + amount + " 1CB: " + balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("[DEPOSIT] Deposit completed of " + amount);
    }

    public static void main(String[] args) {
        WithoutNotify withoutNotify = new WithoutNotify();


        //thread1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int withdraw = 1000;
                try {
                    System.out.println("[Thread1] started");
                    withoutNotify.withdraw(withdraw);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread1.setName("thread1");
        thread1.start();


        //thread2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int deposit = 10000;
                try {
                    System.out.println("[Thread2] Sleeping for 2s");
                    Thread.sleep(2000);
                    System.out.println("[Thread2] 2s sleep completed");
                    withoutNotify.deposit(deposit);
                    System.out.println("[Thread2] Deposited amount " + deposit);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        thread1.setName("thread2");
        thread2.start();


    }
}
