package ch03.cash_register;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {

    private double taxRate;
    private double purchase;
    private double taxablePurchase;
    private double payment;
    private int itemCount;

    /**
     * Constructs a cash register with no money in it.
     * @param rate the tax rate for taxable purchases
     */
    public CashRegister(double rate) {
        taxRate = rate;
        purchase = 0;
        payment = 0;
    }

    /**
     * Records the sale of a tax-free item.
     * @param amount the price of the item
     */
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        itemCount++;
    }

    /**
     * P3.2 Records the sale of a taxable item.
     * @param amount the price of the item
     */
    public void recordTaxablePurchase(double amount) {
        purchase = purchase + amount;
        taxablePurchase = taxablePurchase + amount;
        itemCount++;
    }

    /**
     * Processes a payment received from the customer.
     * @param amount the amount of the payment
     */
    public void receivePayment(double amount) {
        payment = payment + amount;
    }

    /**
     * Get total amount paid.
     * @return the amount of the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * Get amount purchased.
     * @return the amount purchased
     */
    public double getPurchase() {
        return purchase;
    }

    /**
     * Processes the total amount of sales tax due.
     * @return the amount of tax due
     */
    public double getTotalTax() {
        return taxablePurchase * taxRate / 100;
    }

    /**
     * P3.1 Gets the amount of items purchased.
     * @return amount of items purchased
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public double giveChange() {
        double change = payment - purchase - getTotalTax();
        purchase = 0;
        taxablePurchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }
}
