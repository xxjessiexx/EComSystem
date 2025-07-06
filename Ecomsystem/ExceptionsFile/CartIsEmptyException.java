package Ecomsystem.ExceptionsFile;

public class CartIsEmptyException extends Exception {

    public CartIsEmptyException() {
        super("The cart is empty. Please add items to the cart before proceeding.");
    }

    public CartIsEmptyException(String s) {
        super(s);
    }
    

}
