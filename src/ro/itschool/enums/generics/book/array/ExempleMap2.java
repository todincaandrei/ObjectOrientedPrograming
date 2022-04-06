package ro.itschool.enums.generics.book.array;

import ro.itschool.enums.generics.book.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExempleMap2 {
    public static void main(String[] args) {
        HashMap<Character, Book> dictionar = new HashMap<>();
        Book book = new Book();
        book.setName("Cartea Junglei");
        book.setAuthor("Mircea");

        dictionar.put('C', book);

        Book book2 = new Book();
        book2.setName("Trei muschetari");
        book2.setAuthor("Gabriel");

        dictionar.put('T', book2);


        for (Map.Entry<Character, Book> entry : dictionar.entrySet()) {

            Character key = entry.getKey();
            Book bookInMap = entry.getValue();

            System.out.println("La cheia " + key + " se afla cartea: " + bookInMap.getName());
        }

        Book bookFound = dictionar.get('C');
        System.out.println("Cartea gasita: " + bookFound.getName());


        HashMap<Character, ArrayList<Book>> dictionareCarti = new HashMap<>();
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        dictionareCarti.put('C', books);
        ArrayList<Book> booksAtC = dictionareCarti.get('C');

        for (Book bookAtC : booksAtC){
            System.out.println(bookAtC.getName());

        }
    }
}
