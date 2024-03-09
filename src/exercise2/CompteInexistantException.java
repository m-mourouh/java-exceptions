package exercise2;

public class CompteInexistantException extends Exception {

    @Override
    public String getMessage() {
        return "Account does not exist";
    }
}
