package ro.itschool.mostenire.magazin;

public class Fruits extends Product{


    public Fruits(String name, int price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Fructul este: " + getName() + " cu pretul de :" + getPrice() + " lei";
    }

    @Override
    public double calculateDiscount() {
        return 10* getPrice() /100;
    }
}
