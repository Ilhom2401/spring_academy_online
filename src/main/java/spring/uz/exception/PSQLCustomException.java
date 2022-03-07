package spring.uz.exception;

public class PSQLCustomException extends RuntimeException{
    public PSQLCustomException(String message) {
        super(message);
    }
}
