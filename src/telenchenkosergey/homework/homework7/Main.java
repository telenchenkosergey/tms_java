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

        Reader reader = new Reader("Sergey Telenchenko");

        reader.takeBook(king, orwell, schildt, galata, bayliss);
        reader.returnBook(orwell);
        reader.returnBook(returnedBooks);

        System.out.println(reader.rentedBooks);
    }
}
