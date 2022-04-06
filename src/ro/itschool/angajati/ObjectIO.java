package ro.itschool.angajati;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectIO {


    public List<Employee> readEmployee() {

        File file = new File("E:\\ItSchool\\TestAngajati\\employees.txt");

        List<Employee> employees = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            employees = (List<Employee>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("No employees yet!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;


    }

    public void writeEmployee(List<Employee> employees) {

        File file = new File("E:\\ItSchool\\TestAngajati\\employees.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}







