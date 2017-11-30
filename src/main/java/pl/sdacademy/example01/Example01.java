package pl.sdacademy.example01;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class Example01 implements Runnable {

    private static final int LOOP_SIZE = 1_000_000;

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Thread(new Example01());
        Thread thread02 = new Thread(new Example01());

        thread01.start();
        thread02.start();

        thread01.join();
        thread02.join();

        System.out.println("counter: " + counter);
    }

    @Override
    public void run() {
        for (int i = 0; i < LOOP_SIZE; i++) {
            counter++;
        }
    }
}
