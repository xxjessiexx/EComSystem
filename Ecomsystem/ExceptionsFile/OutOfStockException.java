package Ecomsystem.ExceptionsFile;

public class OutOfStockException extends Exception {

    public OutOfStockException() {
        super("The requested product is out of stock.");
    }

    public OutOfStockException(String s) {
        super(s);
    }

}
