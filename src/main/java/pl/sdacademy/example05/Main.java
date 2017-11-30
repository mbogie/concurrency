package pl.sdacademy.example05;

public class Main {

    public static void main(String[] args) {
        Buffer monitor = new Buffer(10);
        Producer producer = new Producer(monitor);
        Consumer consumer = new Consumer(monitor);

        producer.start();
        consumer.start();
    }
}

