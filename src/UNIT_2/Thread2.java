package UNIT_2;

public class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println("Thread 2...Odd numbers : "+i);
                    Thread.sleep(2000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
