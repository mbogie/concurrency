package pl.sdacademy.example06;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producent extends Thread {
    private Bufor bufor;
    private int id;
    
    public Producent(int id, Bufor bufor) {
        this.id=id;
        this.bufor=bufor;
    }//public Producent
    
    public void run() {
        Random generator=new Random();
        int dane;
        
        while (true) {
            dane=generator.nextInt();
            try {
                bufor.wstaw(dane);
                System.out.println("Producent "+id+" wstawil "+dane);
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//while
    }//public void run
    
}//public class Producent
