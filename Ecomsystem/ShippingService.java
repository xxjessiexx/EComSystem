package Ecomsystem;

import java.util.ArrayList;

public abstract class ShippingService implements shippable {
    int cost = 30;

    public static void getNotice(ArrayList<product> products ){
        System.out.println("Shipment notice");
        for(product p : products) {
            if (p.isShipping()) {
                System.out.println(p.getAdded() +"x" + p.getName() + "        "+ p.getWeight() + "g");
            } 
        }
        System.out.println("Total package weight: " + getWeight(products) + "g");
        
    }


    public static int getWeight(ArrayList<product> products) {
        int totalWeight = 0;
        for (product p : products) {
            if (p.isShipping()) {
                totalWeight += p.getWeight() * p.getAdded();
            }
        }
        return totalWeight;
    }
    
}
