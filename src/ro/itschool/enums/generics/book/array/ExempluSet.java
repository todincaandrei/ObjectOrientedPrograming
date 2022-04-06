package ro.itschool.enums.generics.book.array;

import java.util.HashSet;
import java.util.Iterator;

public class ExempluSet {
    public static void main(String[] args) {

        HashSet<Double> set = new HashSet<>();

        set.add(2.3);
        set.add(2.3);
        set.add(4.5);

        for (Double number : set){
            System.out.println(number);
        }

        Iterator<Double> it = set.iterator();

        while (it.hasNext()){
            Double number = it.next();
            System.out.println(number);
        }
    }
}
