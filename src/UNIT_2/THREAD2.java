package UNIT_2;

public class THREAD2 extends Thread{
    public void run()
    {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            }
        }

            catch(Exception e){
                e.printStackTrace();
            }


        }


    }
}
