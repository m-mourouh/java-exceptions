package exercise1;

public class NombreNegatifException  extends Exception{
    private int val;

    public NombreNegatifException(int val) {
        this.val = val;
    }

    public NombreNegatifException() {}

    public int getVal() {
        return val;
    }
    @Override
    public String getMessage() {
        return "Number is negative: " + this.getVal();
    }

}
