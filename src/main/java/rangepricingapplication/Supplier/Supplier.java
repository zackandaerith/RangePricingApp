/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import rangepricingapplication.ProductManagement.ProductCatalog;

/**
 *
 * @author Zheng Fang
 */
public class Supplier {
    SupplierDirectory directory;
    String name;
    ProductCatalog productcatalog;
    public Supplier(String n , SupplierDirectory d){
        name = n;
        productcatalog = new ProductCatalog();
        directory = d;
        
    }
}
