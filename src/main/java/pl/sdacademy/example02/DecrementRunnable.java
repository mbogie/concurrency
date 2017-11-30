package pl.sdacademy.example02;

import static pl.sdacademy.example02.Example02.LOOP_SIZE;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class DecrementRunnable implements Runnable {

    private Counter counter;

    public DecrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < LOOP_SIZE; i++) {
            counter.decrement();
        }
    }

}
