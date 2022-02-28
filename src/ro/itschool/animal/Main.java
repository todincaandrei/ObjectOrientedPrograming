package ro.itschool.animal;

public class Main {
    public static void main(String[] args) {

        Animal pisica = new Animal("Ceva","gri");

        pisica.toarce();
        pisica.toarce();

        Animal[]  pisicileMele = new Animal[20];
        for (int i = 0; i < pisicileMele.length; i++) {
            pisicileMele[i] = new Animal("Pisica numarul " + i,"rosie");
        }







    }
}
