package multithreading.volatilekeyword;

public class Main {
    volatile public static int flag = 0;

    public static void main(String[] args) {
        //thread 1
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    if (flag == 0) {
                        System.out.println("Running...");
                        i++;
                    }else {
                        break;
                    }
                }
            }
        }).start();

        //thread 2
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                    flag = 1;
                    System.out.println("Value of flag switched to 1");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
