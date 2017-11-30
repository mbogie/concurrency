package pl.sdacademy.example03;

/**
 * Hello world!
 *
 */
public class Example03 {

    public static void main( String[] args ) throws InterruptedException {
        Counter counter = new Counter(3);
        WriterThread thread01 = new WriterThread("I'm number one", counter, 0);
        WriterThread thread02 = new WriterThread("I'm number two", counter, 1);
        WriterThread thread03 = new WriterThread("I'm the last one", counter, 2);
        System.out.println(thread01.getState());
        thread01.start();
        thread02.start();
        thread03.start();
        System.out.println(thread01.getState());
    }
}
