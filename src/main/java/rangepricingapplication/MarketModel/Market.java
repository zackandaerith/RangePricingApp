/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author Zheng Fang
 */
public class Market {
    ArrayList<MarketChannelAssignment> channels;
    ArrayList<String> characteristics;
    int size;
public Market(String s){
    characteristics = new ArrayList();
    characteristics.add(s);
}
}
