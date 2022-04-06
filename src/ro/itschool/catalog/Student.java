package ro.itschool.catalog;

import java.util.ArrayList;

public class Student {

    private String FirstName;
    private String LastName;

   private ArrayList<RubricaAbsenta> rubricaAbsentas = new ArrayList<>();

    public ArrayList<RubricaAbsenta> getRubricaAbsentas() {
        return rubricaAbsentas;
    }

    public void setRubricaAbsentas(ArrayList<RubricaAbsenta> rubricaAbsentas) {
        this.rubricaAbsentas = rubricaAbsentas;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Student(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }


    public void addRubrica(RubricaAbsenta rubricaAbsenta) {
        rubricaAbsentas.add(rubricaAbsenta);
    }
}
