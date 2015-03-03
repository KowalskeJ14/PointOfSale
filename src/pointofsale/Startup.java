
package pointofsale;

/**
 *
 * @author kowal_000
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Start sale
        CashRegister register = new CashRegister();
        
        register.startSale("100", new FakeDatabase(), new RegisterPrintOut());
        
        //Add Products
        register.scanProduct("A101", 1);
        register.scanProduct("A102", 1);
        register.scanProduct("A103", 10);
        
        //End Sale
        register.endSale();
    }
    
}
