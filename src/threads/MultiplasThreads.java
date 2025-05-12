package threads;

public class MultiplasThreads {

    private static int i = -1;

    // Paralelismo x Concorrência

    static class MyRunnable implements Runnable {

        static final Object lock = new Object();
        static final Object lock2 = new Object();

        @Override
        public void run() {
            synchronized (lock) { // synchronized trava o processamento do objeto atual (this) com isso somente 1 por vez pode executar o trecho de run()
                i++;
                String current = Thread.currentThread().getName();
                System.out.println(current + ":" + i);
            }
            synchronized (this) { // Usando diferentes "locks" ou "objetos burros"
                i++;
                String current = Thread.currentThread().getName();
                System.out.println(current + ":" + i);
            }
        }
    }

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

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
}
