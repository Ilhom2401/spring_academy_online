package spring.uz.exception;


public class UserCustomException extends RuntimeException{

    public UserCustomException(String message) {
        super(message);
    }

    //TODO Asadbek should check Exception instead of RuntimeException
}
