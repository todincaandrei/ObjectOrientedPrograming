package ro.itschool.mostenire.abstractclass;

public class Patrat extends Shape {

    private int latura;


    @Override
    public double getPerimeter() {
        return 4 * latura;
    }


}
