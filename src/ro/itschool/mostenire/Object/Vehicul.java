package ro.itschool.mostenire.Object;

public class Vehicul {

    private int maxSpeed;

    public Vehicul(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicul cu viteza de " + this.maxSpeed;
    }
}
