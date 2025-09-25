package UNIT_2;

public class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread -> " + i +" After 10 seconds");
                Thread.sleep(10000);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
