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
public class Receipt {
    
    private String receiptText;
    private ReceiptDataAccessStrategy db;
    private ReceiptOutputStrategy receiptOut;
    private ICustomer customer;
    private LineItem[] productList = new LineItem[0];

    public Receipt(String custId, ReceiptDataAccessStrategy db, ReceiptOutputStrategy receiptOut) {
        startReceipt();
        this.db = db;
        this.customer = db.findCustomer(custId);
        this.receiptOut = receiptOut;
        addCustomer();
    }
    
    private void startReceipt() {
        receiptText = "Welcome to Kohl's!\n";
    }
   
    private void addCustomer() {
        receiptText += "Customer ID: " + customer.getCustId() + "\n";
        receiptText += "Name: " + customer.getName() + "\n";
    }
    
    public void addProduct(String prodId, int qty) {
        LineItem[] temp = new LineItem[productList.length + 1];
        System.arraycopy(productList, 0, temp, 0, productList.length);
        
        productList = temp;
        temp = null;
        
        productList[productList.length - 1] = new LineItem(db.findProduct(prodId), qty);
        
        receiptText += productList[productList.length -1].getProduct().getName()
                    + productList[productList.length -1].getQty()
                    + productList[productList.length -1].getProduct().getPrice()
                    + productList[productList.length -1].getProduct().getDiscountAmt(qty);
    }
    
    public void writeReceipt() {
        receiptOut.print(receiptText);
    }
    
}
