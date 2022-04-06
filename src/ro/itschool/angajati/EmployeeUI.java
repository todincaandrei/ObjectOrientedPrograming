package ro.itschool.angajati;

import java.util.Scanner;

public class EmployeeUI {

    public void startProgram() {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        int optiune;
        do {
            System.out.println("0.Exit");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employees");
            optiune = sc.nextInt();
            sc.nextLine();

            if (optiune == 1) {
                System.out.println("Enter cnp of employee:");
                String cnp = sc.nextLine();
                System.out.println("Enter last name of employee: ");
                String lastName = sc.nextLine();
                System.out.println("Enter first name of employee:");
                String firstName = sc.nextLine();
                System.out.println("Enter position of employee:");
                String position = sc.nextLine();

                Employee employee = new Employee();
                employee.setCnp(cnp);
                employee.setLastName(lastName);
                employee.setFirstName(firstName);
                employee.setPosition(position);
                employeeService.addEmployee(employee);
            }
            else if (optiune == 2){
                employeeService.viewEmployees();




            }

        } while (optiune != 0);


    }


}
