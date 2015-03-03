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
public class CashRegister {
    
    private Receipt receipt;

    public CashRegister() {
        
    }
    
    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
       
    public void startSale(String custId, ReceiptDataAccessStrategy db, ReceiptOutputStrategy receiptOut) {
        receipt = new Receipt(custId, db, receiptOut);
    }
    
    public void scanProduct(String prodId, int qty) {
        receipt.addProduct(prodId, qty);
    }
    
    public void endSale() {
        receipt.writeReceipt();
    }
}
