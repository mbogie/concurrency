package pl.sdacademy;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class Counter {

    private int threadSequence;
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
