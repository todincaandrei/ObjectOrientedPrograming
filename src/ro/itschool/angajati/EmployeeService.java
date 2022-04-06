package ro.itschool.angajati;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private ObjectIO objectIO = new ObjectIO();

    public void addEmployee(Employee employee) {

        List<Employee> existingEmployees = objectIO.readEmployee();
        existingEmployees.add(employee);
        objectIO.writeEmployee(existingEmployees);

    }

    public void viewEmployees() {

        List<Employee> employeesFromFile = objectIO.readEmployee();

        for (Employee employee : employeesFromFile) {
            System.out.println(employee.getCnp() + " " + employee.getLastName() + " " + employee.getFirstName() + " (" + employee.getPosition() + ")");
        }

    }
}
