package ro.itschool.strings;

public class MainDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "Pitbul");
        Dog dog2 = new Dog("Rex", "Pitbul");
        Dog dog3 = dog1;
        Dog dog4 = dog1;
        if (dog1 == dog2){
            System.out.println("Sunt la fel");
        }

        if (dog1 == dog3){
            System.out.println("Dog 1 este la fel ca dog 3");
        }

        if (dog1.equals(dog2)){

        }

    }
}
