package ro.itschool.shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }


    public void removeProduct(int cod) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getCod() == cod) {
                products.remove(product);
            }
        }
    }

    public Product searchProduct(int cod) {
        Product productFound = null;
        for (Product product : products) {
            if (product.getCod() == cod) {
                productFound = product;
            }
        }
        return productFound;
    }


    public void displayProduct(){
        for (Product product: products) {
            System.out.println(product);
        }
    }


}
