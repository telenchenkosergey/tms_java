package telenchenkosergey.homework.homework7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book king = new Book("S. King", "Misery");
        Book orwell = new Book("G. Orwell", "Animal Farm");
        Book schildt = new Book("H. Schildt", "Java: A Beginner's Guide");
        Book galata = new Book("I. Galata", "Kotlin Apprentice");
        Book bayliss = new Book("D. Bayliss", "Android Apprentice");

        ArrayList<Book> returnedBooks = new ArrayList<>();
        returnedBooks.add(king);
        returnedBooks.add(schildt);

        ArrayList<Reader> readers = new ArrayList<>();

        readers.add(new Reader("Sergey Telenchenko"));
        readers.add(new Reader("Roger Smith"));
        readers.add(new Reader("General Zhmyshenko"));

        readers.get(0).takeBook(king, orwell, schildt, galata, bayliss);
        readers.get(0).returnBook(orwell);
        readers.get(0).returnBook(returnedBooks);

        readers.get(1).takeBook(schildt, galata);
        readers.get(1).returnBook(galata);
    }
}
