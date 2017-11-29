package pl.sdacademy;

/**
 * Hello world!
 *
 */
public class App
{
    static Counter counter = new Counter();

    public static void main( String[] args ) throws InterruptedException {

        WriterThread thread01 = new WriterThread("I'm number one", counter, 0);
        WriterThread thread02 = new WriterThread("I'm number two", counter, 1);
        WriterThread thread03 = new WriterThread("I'm the last one", counter, 2);
        System.out.println(thread01.getState());
        thread01.start();
        thread02.start();
        thread03.start();
        System.out.println(thread01.getState());

        Thread.sleep(10000);

    }
}
