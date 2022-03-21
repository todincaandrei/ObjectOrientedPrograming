package ro.itschool.shop;

import java.util.Scanner;

public class Menu {
    public void startProgram() {
        Scanner sc = new Scanner(System.in);
        int optiune;
        Shop shop = new Shop();

        do {
            System.out.println("0.Exit");
            System.out.println("1.Add product");
            System.out.println("2.Remove product");
            System.out.println("3.View products");
            System.out.println("4.Search product by code");
            optiune = sc.nextInt();
            sc.nextLine();

            if (optiune == 1) {
                System.out.println("Enter product cod: ");
                int productCode = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter product name:");
                String productName = sc.nextLine();
                System.out.println("Enter product description: ");
                String productDescription = sc.nextLine();
                System.out.println("Enter product price:");
                double price = sc.nextDouble();
                sc.nextLine();
                Product product = new Product(productCode, productName, productDescription);
                product.setDescription(productDescription);
                shop.addProduct(product);
            }
            if (optiune == 2) {
                System.out.println("Enter code of product that will be deleted: ");
                int productCode = sc.nextInt();
                sc.nextLine();
                shop.removeProduct(productCode);

            }
            if (optiune == 3) {
                shop.displayProduct();
            }
            if (optiune == 4) {
                System.out.println("Enter cod of product that will be searched: ");
                int cod = sc.nextInt();
                sc.nextLine();


                Product product = shop.searchProduct(cod);
                if (product == null) {
                    System.out.println("Product not found!");
                } else {
                    System.out.println(product);
                }
            }
        } while (optiune != 0);
    }
}
