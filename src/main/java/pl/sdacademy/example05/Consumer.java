package pl.sdacademy.example05;

public class Consumer extends Thread {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        while (true) {
            int element = buffer.get();
            System.out.println("Konsument skonsumowal " + element);
            try {
                sleep(800);
            } catch (InterruptedException ex) {
            }
        }
    }

}

