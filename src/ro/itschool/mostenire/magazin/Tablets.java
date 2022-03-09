package ro.itschool.mostenire.magazin;

public class Tablets extends Product{

    private int displaySize;




    public Tablets(String name, int price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Tablet with " + displaySize + " that cost: " + getPrice();
    }

    @Override
    public double calculateDiscount() {
        return 10* getPrice() /100;
    }
}
