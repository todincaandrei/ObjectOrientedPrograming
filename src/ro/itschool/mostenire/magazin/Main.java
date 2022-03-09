package ro.itschool.mostenire.magazin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        shop.setName("Gabi's shop");
        System.out.println("Welcome to " + shop.getName());

        int optiune;
        do {
            System.out.println("0.Exit");
            System.out.println("1. Add Fruit");
            System.out.println("2.Add Clothes");
            System.out.println("3. View products");
            optiune = sc.nextInt();
            sc.nextLine();

            if (optiune == 1) {
                System.out.println("Enter name of fruit: ");
                String name = sc.nextLine();
                System.out.println("Enter price of fruit");
                double price = sc.nextDouble();
                sc.nextLine();
                Fruits fruits = new Fruits(name, (int) price);
                shop.addProduct(fruits);
            }

            if (optiune == 2)
                System.out.println("enter name of clothing product: ");
            String name = sc.nextLine();
            System.out.println("Enter price of clothing product: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter brand name: ");
            String brand = sc.nextLine();
            System.out.println("Enter product fabric: ");
            String fabric = sc.nextLine();
            System.out.println("Enter size of  product");
            int productSize = sc.nextInt();
            sc.nextLine();
            Clothes clothes = new Clothes(name, (int) price);
            clothes.setBrand(brand);
            clothes.setMaterial(fabric);
            clothes.setSize(productSize);
            shop.addProduct(clothes);

            if (optiune == 3) {
                Product[] products = shop.getProducts();
                for (Product product : products) {
                    System.out.println(product.toString());
                }
            }
        } while (optiune != 0);

    }
}
