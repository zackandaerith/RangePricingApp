/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author Zheng Fang
 */
public class ProductsReport {
 
    ArrayList<ProductSummary> productsummarylist;
    public ProductsReport(){
        
    }
    public void addProductSummary(ProductSummary ps){
        
    productsummarylist.add(ps);
}
    
    public ProductSummary getTopProductAboveTarget(){
        ProductSummary currenttopproduct = null;
        
//        for (ProductSummary ps: productsummarylist){
//            if(currenttopproduct == null)currenttopproduct = ps; // initial step 
//            else 
//                if(ps.getNumberAboveTarget()> currenttopproduct.getNumberAboveTarget()){
//                currenttopproduct = ps; //we have a new higher total
//            }
//        
//                }
        return currenttopproduct;
    }
}
