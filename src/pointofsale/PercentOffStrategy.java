
package pointofsale;

/**
 *
 * @author kowal_000
 */
public class PercentOffStrategy implements DiscountStrategy {
    private double discountRate = 0.10;
    
    public PercentOffStrategy(){
        
    }

    public PercentOffStrategy(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscountAmount(double price, int quantity){
        return discountRate * quantity * price;
    }
    
    @Override
    public double getDiscountTotal(double price, int quantity){
        return price * quantity - getDiscountAmount(price, quantity);
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
        PercentOffStrategy ps = new PercentOffStrategy();
        ps.setDiscountRate(.50);
        System.out.println(ps.getDiscountAmount(100, 2));
    }
}
