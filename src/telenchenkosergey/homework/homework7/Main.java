package telenchenkosergey.homework.homework7;

public class Main {
    public static void main(String[] args) {
        Book king = new Book("S. King", "Misery");
        Book orwell = new Book("G. Orwell", "1984");
        Book schildt = new Book("H. Schildt", "Java: A Beginner's Guide");

        Reader reader = new Reader("Sergey Telenchenko");

        reader.takeBook(king, orwell, schildt);
        reader.returnBook(orwell, king);

    }
}
