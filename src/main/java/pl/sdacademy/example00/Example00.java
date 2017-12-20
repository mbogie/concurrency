package pl.sdacademy.example00;

public class Example00 extends Thread{

    private String name;
    private int count;

    public Example00(String name, int count){
        super();
        this.name = name;
        this.count = count;
    }

    public void run(){
        for (int i = 0; i < count; i++) {
            System.out.println("Jestem watek "+name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread01 = new Example00("Albert", 5);
        Thread thread02 = new Example00("Bartłomiej", 10);
        Thread thread03 = new Example00("Cezary", 7);

        System.out.println("Stan watku " + thread01.getState());
        thread01.start();
        thread02.start();
        thread03.start();
        System.out.println("Watki sa uruchomione");
        System.out.println("Stan watku " + thread01.getState());

        thread01.join();
        thread02.join();
        thread03.join();
        System.out.println("Watki sie zakonczyly");
        System.out.println("Stan watku " + thread01.getState());


    }

}
