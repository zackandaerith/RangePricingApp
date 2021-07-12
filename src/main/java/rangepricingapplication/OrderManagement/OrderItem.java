/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.OrderManagement;

import rangepricingapplication.ProductManagement.Product;

/**
 *
 * @author Zheng Fang
 */
public class OrderItem {

    Product selectedproduct;
    int actualPrice;
    int quantity;
    
    public OrderItem(Product p, int q) {
        selectedproduct = p;
        p.addOrderItem(this); //make sure product links back to the item
        quantity = q;
    }
    
    public int getOrderItemTotal() {
        return actualPrice * quantity;
    }
    //returns positive if seller is making higher margin than target
    //returns negative if seller is making lower margin than target
    //otherwise zero meaning neutral
    public int calculatePricePerformance() {
        return actualPrice - selectedproduct.getTargetPrice();
    }
    public boolean isActualAboveTarget(){
        if (actualPrice> selectedproduct.getTargetPrice()) return true;
        else return false;

}
    public boolean isActualBelowTarget(){
        if (actualPrice<selectedproduct.getTargetPrice()) return true;
        else return false;

}
        public boolean isActualATTarget(){
        if (actualPrice==selectedproduct.getTargetPrice()) return true;
        else return false;

}
}
