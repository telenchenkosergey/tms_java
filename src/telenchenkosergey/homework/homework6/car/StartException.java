package telenchenkosergey.homework.homework6.car;

public class StartException extends RuntimeException {
    public StartException() {
    }

    public StartException(String message) {
        System.err.println(message);
    }
}
