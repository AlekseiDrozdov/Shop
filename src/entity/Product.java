/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Product {
   private String caption;
   private Seller[] seller;
   private int productionYear;
   private double price; 

    public Product() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Seller[] getSeller() {
        return seller;
    }

    public void setSeller(Seller[] seller) {
        this.seller = seller;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "\ncaption=" + caption 
                + ",\n seller=" + Arrays.toString(seller) 
                + ",\n productionYear=" + productionYear 
                + ",\n price=" + price
                + '}';
    }

   
}
