package pl.sdacademy.example02;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class SynchronizedMethodCounter implements Counter {

    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public synchronized void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
