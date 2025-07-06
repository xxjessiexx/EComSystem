package Ecomsystem;
public class product{
    private String name;
    private double price;
    private int quantity;
    private int added;
    private boolean expired;
    private boolean shipping ;
    private int weight;
    public product(){}
    public product( String name,double price,int quantity,  boolean expired, boolean shipping, int weight){
        this.name = name;
        this.price=price;
        this.quantity = quantity;
        this.expired = expired;
        this.shipping = shipping;
        this.weight = weight;
        this.added = 0;
    }
    public void sub( int quantity){
         this.quantity-= quantity ;}
    public void addQuantity(int quantity){
        this.added+= quantity;
    }
    //setters and getters for products
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
     public int getAdded() {
        return added;
    }
    public void setAdded(int added) {
        this.added = added;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean isExpired() {
        return expired;
    }
    public void setExpired(boolean expired) {
        this.expired = expired;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public boolean isShipping() {
        return shipping;
    }
    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }
 
}
