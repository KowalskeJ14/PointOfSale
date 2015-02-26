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
public class DollarOffStrategy implements DiscountStrategy{

    private double discountRate;
    
    public DollarOffStrategy() {
        
    }
    
    public DollarOffStrategy(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscountAmount(double price, int quantity) {
       return quantity * discountRate;
    }

    @Override
    public double getDiscountTotal(double price, int quantity) {
        return (quantity * price) - (quantity * discountRate);
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static void main(String[] args) {
        DollarOffStrategy dos = new DollarOffStrategy();
        dos.setDiscountRate(10);
        System.out.println(dos.getDiscountAmount(100, 2));
        System.out.println(dos.getDiscountTotal(100, 1));
    }
    
}
