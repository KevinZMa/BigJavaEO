package ch03.cash_register;

/**
 * A class to test the CashRegister class.
 */
public class CashRegisterTester {

    public static void main(String[] args) {
        // 9% sales tax on taxable purchases
        CashRegister register = new CashRegister(9);

        register.recordPurchase(30);
        register.recordTaxablePurchase(20);

        register.receivePayment(60);

        System.out.println(register.getItemCount());
        System.out.println("Expected: 2");

        System.out.println(register.giveChange());
        System.out.println("Expected: 8.2");
    }
}
