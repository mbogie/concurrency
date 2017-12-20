package pl.sdacademy.example06;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Konsument extends Thread {
    private Bufor bufor;
    private int id;
    
    public Konsument(int id, Bufor bufor) {
        this.id=id;
        this.bufor=bufor;
    }//public Producent
    
    public void run() {
        int dane;
        
        while (true) {
            try {
                dane=bufor.pobierz();
                System.out.println("Konsument "+id+" pobral "+dane);
                sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Konsument.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }//while
    }//public void run
    
}//public class Konsument
