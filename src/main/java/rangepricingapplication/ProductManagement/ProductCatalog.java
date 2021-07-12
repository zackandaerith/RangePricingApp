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
public class ProductCatalog {
    String type;
    ArrayList<Product> products;
    public ProductCatalog(String n){
        type = n;
        products = new ArrayList();
    }
        public ProductCatalog(){
        type = "noname";
        products = new ArrayList();
    }
    public Product newProduct(int fp, int cp, int tp){
        Product p = new Product(fp, cp, tp);
        products.add(p);
        return p;
    }
    public ProductsReport generatPerformanceReport(){
        ProductsReport productsreport = new ProductsReport();
    
        for(Product p: products){
            
            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport; 
    }  
    
    
}



