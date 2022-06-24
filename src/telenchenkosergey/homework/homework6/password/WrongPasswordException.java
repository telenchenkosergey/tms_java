package telenchenkosergey.homework.homework6.password;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        System.err.println(message);
    }
}
