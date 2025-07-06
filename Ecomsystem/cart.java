package Ecomsystem;
import java.util.ArrayList;

import Ecomsystem.ExceptionsFile.*;

public class cart {
    ArrayList<product> products;
    double totalPrice;
    int totalWeight;
    public cart(){
        this.totalPrice = 0;
        products = new ArrayList<product>();
    }
     
    public void add(product product , int quantity)throws Exception {
        if (product.isExpired()){throw new ExpiredProductException();}
        if (product.getQuantity()>= quantity ){
       
             products.add(product);
             totalPrice += product.getPrice();
             totalWeight += product.getWeight();
             product.addQuantity(quantity);

        
        product.sub(quantity);   }
        else{ throw new OutOfStockException();}
       
        
    }

    public void checkoutReceipt(){
        System.out.println(" Checkout Receipt:");
        for(product p : products) {
            System.out.println(p.getAdded() +"x" + p.getName() + "        "+ p.getPrice() + "EGP");
        }
        System.out.println("--------------------------------");

        System.out.println(" Subtotal: " + totalPrice);
        System.out.println(" Shipping:  30 EGP");
        System.out.println(" Total: " + (totalPrice + 30) + " EGP");
       
    }
    public static void checkout( customer customer , cart cart) throws Exception {
        if(cart.products.size() == 0){throw new CartIsEmptyException(); }
        double cartCost = cart.totalPrice + 30;
        if (customer.getBalance() >= cartCost) {
           customer.setBalance ((int) (customer.getBalance() - cartCost)) ;
           ShippingService.getNotice(cart.products);
           cart.checkoutReceipt();
           System.out.println(customer.getName()+" your remaining balance is :" +customer.getBalance());
            System.out.println("Thank you for your purchase, " + customer.getName() + "!");
            cart.products.clear(); 
        } else {
            throw new BalanceInsuffiecientException();
        }
    }
     public static void main(String[] args) {
    cart c = new cart();
    cart c2 = new cart();
    cart c3 = new cart();
    customer yasmin = new customer("yasmin", c, 30000);
    customer omar = new customer("omar", c, 300);
    product phone = new product("phone", 10000, 10,false,true,3000);
    product cheese = new product("cheese", 20, 5, false, true,200);
    product  MobileScratchCard = new product("MobileScratchCard", 10, 10, false, false, 9);
    try {
    c.add(cheese, 2);
    c.add(phone, 1);
    checkout(yasmin,c);
    c2.add(MobileScratchCard, 5);
    c2.add(cheese, 3);
    c2.add(phone, 1);
     cheese.setExpired(true);
     c2.add(cheese, 3);
     checkout(yasmin, c2);


    } catch (Exception e) {
       System.out.println(e.getMessage());
    }
    try{
         c3.add(phone, 3);
         checkout(omar, c3);
    }
     catch (Exception e) {
       System.out.println(e.getMessage());
    }
   

 }

}
