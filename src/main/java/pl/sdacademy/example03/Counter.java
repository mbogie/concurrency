package pl.sdacademy.example03;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class Counter {

    private volatile int threadSequence;
    private int threadCount;

    public Counter(int threadCount) {
        this.threadCount = threadCount;
    }

    public int getThreadSequence() {
        return threadSequence;
    }

    public void incrementThreadSequence() {
        threadSequence = (threadSequence + 1) % threadCount;
    }

}
