package ro.itschool.compozitie.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zoo zoo = new Zoo();
        int option ;
        do {
            System.out.println("0.Exit");
            System.out.println("1.Add animals ");
            System.out.println("2.View animals");
            option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                System.out.println("Enter name of animal");
                String name = sc.nextLine();

                System.out.println("Enter age of animal");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter position in the zoo (0 - 4): ");
                int position = sc.nextInt();
                sc.nextLine();
                Animal animal = new Animal(name, age);
                zoo.addAnimal(position, animal);
            }else if (option == 2){
                Animal[] animals = zoo.getAnimals();

                for (int i = 0; i < animals.length; i++) {
                    System.out.print("[ " + i + " ]");
                    Animal animal = animals[i];
                    if (animals[i] != null) {
                        System.out.println(animal.getName());
                    }else {
                        System.out.println();
                    }
                }
            }

        } while (option != 0);
    }
}
