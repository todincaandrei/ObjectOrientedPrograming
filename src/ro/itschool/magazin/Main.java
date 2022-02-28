package ro.itschool.magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazinulGalben = new Magazin("Magazinul Galben");
        magazinulGalben.deschideMagazin();

        magazinulGalben.vinde();

        magazinulGalben.inchideMagazin();
        magazinulGalben.vinde();




    }
}
