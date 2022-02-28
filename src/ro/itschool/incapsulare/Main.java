package ro.itschool.incapsulare;

public class Main {
    public static void main(String[] args) {

        PC pculMeu = new PC();
        pculMeu.setMemorieRam(256);
        pculMeu.setCapacitateHDD(4);
        pculMeu.setNumarProcesoare(4);

        System.out.println("Pc-ul meu are: "  + pculMeu.getMemorieRam()+ "GB RAM" );
        System.out.println("Pc-ul meu are: "  + pculMeu.getMemorieRam()+ "GB RAM" );
        System.out.println("Pc-ul meu are: "  + pculMeu.getMemorieRam()+ "GB RAM" );

        int ramPc = pculMeu.getMemorieRam();
        System.out.println(ramPc);

    }











}
