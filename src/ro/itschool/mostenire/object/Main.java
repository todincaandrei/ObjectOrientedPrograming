package ro.itschool.mostenire.object;

public class Main {
    public static void main(String[] args) {
        Vehicul vehicle = new Vehicul(180);


        String rezultat = vehicle.toString();
        System.out.println("Rezultatul este: " + rezultat);
    }
}
