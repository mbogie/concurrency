package pl.sdacademy.example00;

<<<<<<< HEAD
public class Example00 extends Thread{
=======
public class Example00 extends Thread {
>>>>>>> 1781dd3947a2c1cb9a342bc38a867fbb75585d67

    private String name;
    private int count;

<<<<<<< HEAD
    public Example00(String name, int count){
=======
    public Example00(String name, int count) {
>>>>>>> 1781dd3947a2c1cb9a342bc38a867fbb75585d67
        super();
        this.name = name;
        this.count = count;
    }

<<<<<<< HEAD
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
=======
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Jestem watek " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Example00("Albert", 5);
        Thread thread02 = new Example00("Bartlomiej", 10);
>>>>>>> 1781dd3947a2c1cb9a342bc38a867fbb75585d67
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
<<<<<<< HEAD


    }

=======
    }
>>>>>>> 1781dd3947a2c1cb9a342bc38a867fbb75585d67
}
