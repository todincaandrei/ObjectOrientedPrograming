package ro.itschool.enums.generics.book.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ExempluIterator {
    public static void main(String[] args) {

        ArrayList<Double> vector = new ArrayList<>();
        vector.add(2.3);
        vector.add(4.5);
        vector.add(7.8);
        vector.add(10.5);

        for (int i = 0; i < vector.size(); i++) {
            Double number = vector.get(i);
            if (number == 7.8) {
                vector.remove(i);
            } else {
                System.out.println(number);
            }
        }

        int i = 0;
        System.out.println("--------------------");
        for (Double number : vector) {
            if (number == 4.5) {
                vector.remove(i);
            } else {
                i++;
            }

            System.out.println(number);
        }

        System.out.println("----------------------");


        Iterator<Double> it = vector.iterator();

//        Double number = it.next(); // 4.5 if counter  = 0, arata la ce counter suntem si adauga la counter +1


        while (it.hasNext()) {
            Double number = it.next();
            System.out.println(number);

            if (number == 2.3) {
                it.remove();
            } else {
                System.out.println(number);
            }
        }
    }
}
