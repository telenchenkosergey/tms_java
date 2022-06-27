package telenchenkosergey.homework.homework6.car;

import java.io.IOException;

public class StartException extends IOException {
    public StartException() {
    }

    public StartException(String message) {
        System.err.println(message);
    }
}
