package telenchenkosergey.homework.homework7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Book Objects
        Book king = new Book("S. King", "Misery");
        Book orwell = new Book("G. Orwell", "Animal Farm");
        Book schildt = new Book("H. Schildt", "Java: A Beginner's Guide");
        Book galata = new Book("I. Galata", "Kotlin Apprentice");
        Book bayliss = new Book("D. Bayliss", "Android Apprentice");

        // Arraylist of returned books
        ArrayList<Book> returnedBooks = new ArrayList<>();
        returnedBooks.add(king);
        returnedBooks.add(schildt);

        // Arraylist of Readers
        ArrayList<Reader> readers = new ArrayList<>();

        readers.add(new Reader("Sergey Telenchenko"));
        readers.add(new Reader("Roger Smith"));
        readers.add(new Reader("General Zhmyshenko"));

        Reader sergey = readers.get(0);
        Reader roger = readers.get(1);

        sergey.takeBook(king, orwell, schildt, galata, bayliss);
        sergey.returnBook(orwell);
        sergey.returnBook(returnedBooks);

        roger.takeBook(schildt, galata);
        roger.returnBook(galata);
    }
}
