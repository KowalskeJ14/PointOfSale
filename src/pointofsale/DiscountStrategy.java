
package pointofsale;

/**
 *
 * @author kowal_000
 */
public interface DiscountStrategy {

    public abstract double getDiscountAmount(double price, int quantity);

    public abstract double getDiscountRate();

    public abstract double getDiscountTotal(double price, int quantity);

    public abstract void setDiscountRate(double discountRate);
    
}
