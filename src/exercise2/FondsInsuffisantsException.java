package exercise2;

public class FondsInsuffisantsException extends Throwable {
    @Override
    public String getMessage() {
        return "insufficient balance in the account.";
    }

}
