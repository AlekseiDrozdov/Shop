/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Product;
import entity.Buyer;
import entity.Seller;
import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @seller pupil
 */
public class App {
    Product product;

    public App() {
    }
    public void run(){
//        System.out.println("Hello");
        Product product1 = new Product();
        product1.setCaption("Milk");
        Seller seller1 = new Seller();
        seller1.setName("Lev");
        seller1.setLastname("Bebrov");
        Seller[] sellers = new Seller[1];
        sellers[0] = seller1;
        product1.setSeller(sellers);
        product1.setProductionYear(2021);
        product1.setPrice(0.86);
        
        Product product2 = new Product();
        product2.setCaption("Bread");
        Seller seller2 = new Seller();
        seller2.setName("Ivan");
        seller2.setLastname("Bolov");
        Seller[] sellers2 = new Seller[1];
        sellers2[0] = seller2;
        product2.setSeller(sellers2);
        product2.setProductionYear(2021);
        product2.setPrice(1);
        
        Buyer buyer1 = new Buyer();
        buyer1.setFirstname("Ivan");
        buyer1.setLastname("Ivanov");
        buyer1.setPhone("4564545345");
        
        History history1 = new History();
        history1.setProduct(product1);
        history1.setBuyer(buyer1);
        Calendar c = new GregorianCalendar();
        history1.setPurchaseDate(c.getTime());
        System.out.println("history1 = "+history1.toString());

        
    }
    
    
}
