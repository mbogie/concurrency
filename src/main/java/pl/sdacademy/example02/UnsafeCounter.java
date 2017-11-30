package pl.sdacademy.example02;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class UnsafeCounter implements Counter {

    private int counter;

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
