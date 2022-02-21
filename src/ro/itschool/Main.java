package ro.itschool;

public class Main {

    public static void main(String[] args) {
        House casaMea = new House("Casa mea");
        casaMea.color = "Verde";
        casaMea.numberOfDoors = 10;

        System.out.println("Metri patrati: " + casaMea.meters);





        House casaVecinului = new House("Casa vecinului");
        casaVecinului.color = "Albastru";
        casaVecinului.numberOfDoors = 12;

        User andrei = new User("Something","Something else",25);

    }
}
