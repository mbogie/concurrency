package pl.sdacademy.example04;

import java.util.concurrent.Semaphore;

public class ProducerConsumer {

    private static final int BUFFER_SIZE = 5;

    public static void main(String[] args) {
        Semaphore elements = new Semaphore(0);
        Semaphore freeSpace = new Semaphore(BUFFER_SIZE);
        Buffer bufor = new Buffer(BUFFER_SIZE);
        Producer producer = new Producer(bufor, elements, freeSpace);
        Consumer consumer = new Consumer(bufor, elements, freeSpace);
        producer.start();
        consumer.start();
    }

}

