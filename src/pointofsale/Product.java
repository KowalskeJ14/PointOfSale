/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pointofsale;

/**
 *
 * @author kowal_000
 */
public class Product {
    private String name;
    private String prodId;
    private double price;
    private DiscountStrategy discountStrategy;
    
    public Product(){

    }

    public Product(String name, String prodId, double price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.prodId = prodId;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    private double getdiscountAmt(int qty){
        return discountStrategy.getDiscountAmount(price, qty);
    }
    
    private double getTotalAfterDiscount(int qty){
        return discountStrategy.getDiscountTotal(price, qty);
    }
    
    public static void main(String[] args) {
        
        DiscountStrategy ds = new PercentOffStrategy();
        
        Product product = new Product("Golf Club", "A101", 100, ds);
//        product.setPrice(1000);
        System.out.println(product.getdiscountAmt(5));
        System.out.println(product.getTotalAfterDiscount(5));
    }
}

