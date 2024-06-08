package multithreading.interrupt;

public class Main {

    public static int balance = 0;

    synchronized public void withdraw(int amount) {
        if (balance <= 0) {
            System.out.println("[WITHDRAW] Withdrawing amount " + amount);
            System.out.println("[WITHDRAW] Waiting since the current balance is " + balance + " and we are trying to withdraw " + amount);
            try {
                wait();
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("[WITHDRAW] Withdrawal interrupted");
                return;
            }
            System.out.println("[WITHDRAW] Wait completed");
        }
        if ((balance - amount) < 0) {
            System.out.println("[WITHDRAW] Insufficient funds");
            return;
        } else {
            balance = balance - amount;
            System.out.println("[WITHDRAW] Complted withdraw of " + amount + " Current Balance: " + balance);

        }


    }

    public boolean deposit(int amount) {
        synchronized (this) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("[DEPOSIT] Deposit completed of " + amount);
                notify();
                return true;
            } else {
                System.out.println("[DEPOSIT] Deposit amount should be greater than 0");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        //thread1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int withdraw = 2000;
                main.withdraw(withdraw);
            }
        });
        thread1.setName("thread1");
        thread1.start();


        //thread2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int deposit = 1000;
                if (main.deposit(deposit)) {
                    System.out.println("[thread2] Deposit completed of " + deposit);
                } else {
                    thread1.interrupt();
                }
            }
        });
        thread1.setName("thread2");
        thread2.start();


    }
}