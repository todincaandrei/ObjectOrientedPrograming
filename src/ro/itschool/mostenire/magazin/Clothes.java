package ro.itschool.mostenire.magazin;

public class Clothes extends Product{
    private String brand;
    private int size;
    private String material;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Clothes(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getBrand() +" " + this.getMaterial() + " " + this.getSize()+" " + this.getPrice() + " lei" ;
    }

    @Override
    public String getDescription() {
        return "Cloth names: " + this.getName() + " from brand " + this.getBrand() + " made from: " + material;
    }

    @Override
    public double calculateDiscount() {
        return 5* getPrice() /100;
    }
}
