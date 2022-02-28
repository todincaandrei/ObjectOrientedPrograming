package ro.itschool.magazin;

import java.util.Scanner;

public class Magazin {

    String nume;
    private boolean deschis;


    public Magazin(String nume) {
        this.nume = nume;
        this.deschis = false;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void inchideMagazin() {
        this.deschis = false;
    }

    public void deschideMagazin() {
        this.deschis = true;
    }

    public void vinde() {

        if (!this.deschis) {
            System.out.println("Magazinul este inchid! ");
        } else {
            System.out.println("Ce doresti sa cumperi ? ");
            Scanner sc = new Scanner(System.in);
            String produs = sc.nextLine();
            System.out.println("Felicitari ai cumparat: " + produs);
        }
    }
}
