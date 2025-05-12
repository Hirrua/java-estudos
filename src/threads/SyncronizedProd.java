package threads;

public class SyncronizedProd {

    private static int i = 0;

    public static void main(String[] args) {

        SyncronizedProd.MyRunnable runnable = new SyncronizedProd.MyRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            int j;
            synchronized (this) {
                i++;
                j = i * 2;
            }

            double jElevadoA100 = Math.pow(j, 100);
            double raizQuadrada = Math.sqrt(jElevadoA100);

            String current = Thread.currentThread().getName();

            System.out.println(current + ":" + raizQuadrada);
        }
    }
}
