package pl.sdacademy;

/**
 * http://dominisz.pl
 * 29.11.2017
 */
public class WriterThread extends Thread {

    private Counter counter;
    private String text;
    private int threadId;

    public WriterThread(String text, Counter counter, int threadId) {
        this.text = text;
        this.counter = counter;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (true) {
            while (counter.threadSequence != threadId) {
            }
            System.out.println(text);
            counter.threadSequence++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
