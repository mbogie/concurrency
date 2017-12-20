package pl.sdacademy.example06;

public class Main {

    public static void main(String[] args) {
        Bufor bufor=new Bufor(20);
        Producent producent=new Producent(1, bufor);
        Konsument konsument=new Konsument(100, bufor);
        producent.start();
        konsument.start();
    }//public static void main
    
}//public class Main
