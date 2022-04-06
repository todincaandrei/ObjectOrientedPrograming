package ro.itschool.io;

import java.io.*;

public class fileReadObjectExample {
    public static void main(String[] args) {
        File file = new File("E:\\ItSchool\\io\\computer.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Computer computer = (Computer) objectInputStream.readObject();
            System.out.println(computer.getName());
            System.out.println(computer.getRam());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
