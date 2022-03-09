package ro.itschool.mostenire.magazin;

public abstract class Product {

    private String name;
    private int price;
    private String barcode;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price +" lei";
    }

    public abstract String getDescription();

    public abstract double calculateDiscount();

}
