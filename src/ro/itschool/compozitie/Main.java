package ro.itschool.compozitie;

public class Main {
    public static void main(String[] args) {

        Room room404 = new Room("404");
        Room room403 = new Room("403");

        Student ionescu = new Student("Gabriel", "Ionescu");
        Student popescu = new Student("Alexandru", "Popescu");

        Student grigore = new Student("Grigore", "Popescu");
        Student bunescu = new Student("Mihai", "Bunescu");

        Student[] studentsin404 = new Student[2];
        studentsin404[0] = ionescu;
        studentsin404[1] = popescu;

        room404.setStudents(studentsin404);


        Student[] studentsin403 = new Student[2];
        studentsin403[0] = grigore;
        studentsin403[1] = bunescu;

        room403.setStudents(studentsin403);


    }

}
