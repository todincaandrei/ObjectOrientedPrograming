package ro.itschool.enums.generics.book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("Cartea Junglei");
        book1.setAuthor("Mihai");

        Book book2 = new Book();
        book2.setName("Batman");
        book2.setAuthor("Alexandru");

        Container<Book> library = new Container(new Book[20]);
        library.add(book1);
        library.add(book2);

        Book[] booksFromLibrary = library.getObjects();

        for (Book book : booksFromLibrary) {
            if (book != null) {
                System.out.println(book.getName() + " " + book.getAuthor());
            }
        }


        library.remove(0);
        System.out.println("----------------------------------");
        for (Book book : booksFromLibrary) {
            if (book != null) {
                System.out.println(book.getName() + " " + book.getAuthor());
            }
        }

    }
}
