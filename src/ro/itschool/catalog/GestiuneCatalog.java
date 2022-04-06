package ro.itschool.catalog;

import java.util.Scanner;

public class GestiuneCatalog {

    public void startGestiune() {
        Scanner sc = new Scanner(System.in);

        int optiune;

        Catalog catalog = new Catalog("12G");

        do {
            System.out.println("0.Exit");
            System.out.println("1.Add subject");
            System.out.println("2.View catalog");
            System.out.println("3.Add student");
            System.out.println("4.Add absent");
            optiune = sc.nextInt();
            sc.nextLine();


            if (optiune == 1) {
                System.out.println("Enter name of subject:");
                String nameOfSubject = sc.nextLine();
                Materie materie = new Materie(nameOfSubject);
                catalog.addMaterie(materie);
            } else if (optiune == 2) {
                catalog.display();
            } else if (optiune == 3) {

                System.out.println("Enter first name of student: ");
                String firstName = sc.nextLine();
                System.out.println("Enter last name of student: ");
                String lastName = sc.nextLine();

                Student student = new Student(firstName, lastName);
                catalog.addStudent(student);
            } else if (optiune == 4) {
                System.out.println("Enter absent subject:");
                String absentSubject = sc.nextLine();
                System.out.println("Enter name of student:");
                String nameOfStudent = sc.nextLine();
                System.out.println("Enter date of absent:");
                String date = sc.nextLine();

                catalog.markAbsent(nameOfStudent,absentSubject,date);
            }

        } while (optiune != 0);
    }

}
