package ro.itschool.enums.generics.book.array;

import java.util.HashMap;

public class ExempleMap {
    public static void main(String[] args) {
        HashMap<Integer, String> apartament = new HashMap<>();
        // 23 -> Fam Ionescu

        apartament.put(23, "Fam Ionescu");
        apartament.put(22, "Fam Popescu");
        String valoare = apartament.get(23);
        System.out.println(valoare);


    }
}
