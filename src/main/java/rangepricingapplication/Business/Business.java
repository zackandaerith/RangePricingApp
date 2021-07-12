/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Business;

import rangepricingapplication.Supplier.SupplierDirectory;

/**
 *
 * @author Zheng Fang
 */
public class Business {
    String name;
    
    SupplierDirectory supplierDirectory;
    

    public Business(String name) {
        this.name = name;
        Business newbusiness = new Business(name);
        supplierDirectory = new SupplierDirectory(newbusiness);
    }
    
    
    
    
}
