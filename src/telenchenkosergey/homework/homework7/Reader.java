package telenchenkosergey.homework.homework7;

import java.util.ArrayList;
import java.util.Collections;

public class Reader {
    private final String fullName;
    private String id;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    public ArrayList<Book> rentedBooks;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(Book... books) {
        ArrayList<Book> rentedBooks = new ArrayList<>();
        Collections.addAll(rentedBooks, books);
        this.rentedBooks = rentedBooks;
        StringBuilder builder = new StringBuilder();
        builder.append(this.getFullName()).append(" took books: ");
        for (Book rentedBook : rentedBooks) {
            builder.append(rentedBook).append(", ");
        }
        builder.deleteCharAt(builder.length() - 2);
        System.out.println(builder);
    }

    public void returnBook(Book... books) {
        ArrayList<Book> returnedBooks = new ArrayList<>();
        Collections.addAll(returnedBooks, books);
        StringBuilder builder = new StringBuilder();
        builder.append(this.getFullName()).append(" returned books: ");
        for (Book returnedBook : returnedBooks) {
            builder.append(returnedBook).append(", ");
            this.rentedBooks.remove(returnedBook);
        }
        builder.deleteCharAt(builder.length() - 2);
        System.out.println(builder);

    }

    public String getFullName() {
        return fullName;
    }

    public ArrayList<Book> getRentedBooks() {
        return rentedBooks;
    }
}


