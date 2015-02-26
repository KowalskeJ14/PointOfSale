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
public interface DiscountStrategy {

    double getDiscountAmount(double price, int quantity);

    double getDiscountRate();

    double getDiscountTotal(double price, int quantity);

    void setDiscountRate(double discountRate);
    
}
