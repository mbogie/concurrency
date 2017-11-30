package pl.sdacademy.example02;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class SynchronizedStatementCounter implements Counter {

    private int counter;

    public void increment() {

        synchronized (this) {
            counter++;
        }
    }

    public void decrement() {
        synchronized (this) {
            counter--;
        }
    }

    public int getCounter() {
        return counter;
    }
}
