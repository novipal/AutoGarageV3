package nl.novi.autogaragev2.exception;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException() {
        super("custom error thrown");
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
}
