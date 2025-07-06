package Ecomsystem;
public class customer {
   private String name;
    private cart cart;
    private int balance;
    public customer(){}
    public customer( String name,cart cart,int balance){
        this.name = name;
        this.balance = balance;
        this.cart = cart;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
