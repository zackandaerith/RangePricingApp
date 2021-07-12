/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import java.util.ArrayList;
import rangepricingapplication.Business.Business;

/**
 *
 * @author Zheng Fang
 */
public class SupplierDirectory {
    
    Business business;
    ArrayList<Supplier> suppliers;
    public SupplierDirectory(Business business){
        suppliers = new ArrayList();
        this.business = business;
    }
    public Supplier newSupplier(String n, SupplierDirectory d){
        Supplier supplier = new Supplier(n,d);
        suppliers.add(supplier);
        return supplier;

    }
}
