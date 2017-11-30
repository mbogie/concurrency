package pl.sdacademy.example04;

import java.util.concurrent.Semaphore;

class Consumer extends Thread {

    private Buffer buffer;
    private Semaphore elements;
    private Semaphore freeSpace;

    public Consumer(Buffer buffer, Semaphore elements, Semaphore freeSpace) {
        this.buffer = buffer;
        this.elements = elements;
        this.freeSpace = freeSpace;
    }

    public void run() {
        while (true) {
            elements.acquireUninterruptibly();
            int element = buffer.get();
            freeSpace.release();
            System.out.println("Z bufora pobrano " + element);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

