package telenchenkosergey.homework.homework6.password;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        System.err.println(message);
    }
}
