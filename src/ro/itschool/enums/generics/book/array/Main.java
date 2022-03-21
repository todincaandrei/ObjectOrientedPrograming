package ro.itschool.enums.generics.book.array;

import ro.itschool.enums.generics.book.Book;
import ro.itschool.enums.generics.book.Container;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Cartea Junglei");
        book.setAuthor("Mihai");

        Book book2 = new Book();
        book2.setName("Luceafarul");
        book2.setAuthor("Alexandru");

        ArrayList<Book> container = new ArrayList<>();
        container.add(book);
        container.add(book2);

        for (int i = 0; i < container.size() ; i++) {
           Book bookFromArray = container.get(i);
            System.out.println(bookFromArray.getName() + " " + bookFromArray.getAuthor());
        }

        container.remove(0);

        List<Book> books = new ArrayList<>();


    }
}
