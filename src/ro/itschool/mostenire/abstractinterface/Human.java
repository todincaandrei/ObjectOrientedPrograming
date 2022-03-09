package ro.itschool.mostenire.abstractinterface;

public class Human implements Being, Destroyer{


    @Override
    public void walk() {
        System.out.println("walk walk");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy something");
    }
}
