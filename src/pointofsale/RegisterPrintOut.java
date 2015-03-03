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
public class RegisterPrintOut implements ReceiptOutputStrategy {

    @Override
    public void print(String receiptText) {
        System.out.println(receiptText);
    }
    
}