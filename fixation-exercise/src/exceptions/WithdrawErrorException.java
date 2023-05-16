package exceptions;

public class WithdrawErrorException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public WithdrawErrorException(String msg) {
        super(msg);
    }
}