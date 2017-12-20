package pl.sdacademy.example06;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bufor {
    private Lock blokada;
    private Condition niePelny;
    private Condition niePusty;
    private int[] elementy;
    private int wejscie;
    private int wyjscie;
    private int licznik;
    
    public Bufor(int rozmiar) {
        elementy=new int[rozmiar];
        blokada=new ReentrantLock();
        niePelny=blokada.newCondition();
        niePusty=blokada.newCondition();
        wejscie=0;
        wyjscie=0;
        licznik=0;
    }//public Bufor
    
    public void wstaw(int x) throws InterruptedException {
        blokada.lock();
        try {
            while (licznik==elementy.length) {
                niePelny.await();
            }//while
            elementy[wejscie]=x;
            wejscie=(wejscie+1)%elementy.length;
            licznik++;
            niePusty.signal();
        } finally {
            blokada.unlock();
        }//finally
    }//public put
    
    public int pobierz() throws InterruptedException {
        int tmp;
        blokada.lock();
        try {
            while (licznik==0) {
                niePusty.await();
            }//while
            tmp=elementy[wyjscie];
            wyjscie=(wyjscie+1)%elementy.length;
            licznik--;
            niePelny.signal();
            return tmp;
        } finally {
            blokada.unlock();
        }//finally
    }//public int get
    
}//public class Bufor
