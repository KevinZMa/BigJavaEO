package ch03.cash_register;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {

    private final String CURRENCY_SYMBOL = "$";
    private double taxRate;
    private double purchase;
    private double taxablePurchase;
    private double payment;
    private int itemCount;
    private String receipt = "";
    private int salesCount;
    private double salesTotal;

    /**
     * Constructs a cash register with no money in it and no tax rate.
     */
    public CashRegister() {
        taxRate = 0.0;
    }

    /**
     * Constructs a cash register with no money in it.
     *
     * @param rate the tax rate for taxable purchases
     */
    public CashRegister(double rate) {
        taxRate = rate;
    }

    /**
     * Formats an amount of money to two decimal places.
     * @param amount
     * @return the formatted string
     */
    private String formatAmount(double amount) {
        return String.format("%s%.2f", CURRENCY_SYMBOL, amount);
    }

    /**
     * Records the sale of a tax-free item.
     *
     * @param amount the price of the item
     */
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        itemCount++;

        if (!receipt.isEmpty()) receipt += "\n";
        receipt += formatAmount(amount);
    }

    /**
     * P3.2 Records the sale of a taxable item.
     *
     * @param amount the price of the item
     */
    public void recordTaxablePurchase(double amount) {
        taxablePurchase = taxablePurchase + amount;
        itemCount++;

        if (!receipt.isEmpty()) receipt += "\n";
        receipt += formatAmount(amount) + " (taxable)";
    }

    /**
     * Processes a payment received from the customer.
     *
     * @param amount the amount of the payment
     */
    public void receivePayment(double amount) {
        payment = payment + amount;
    }

    /**
     * Get total amount paid.
     *
     * @return the amount of the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * Get the total amount purchased, excluding tax.
     *
     * @return the amount purchased
     */
    public double getPurchase() {
        return purchase + taxablePurchase;
    }

    /**
     * Processes the total amount of sales tax due.
     *
     * @return the amount of tax due
     */
    public double getTotalTax() {
        return taxablePurchase * taxRate / 100;
    }

    /**
     * P3.1 Gets the amount of items purchased.
     *
     * @return amount of items purchased
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * E3.10 Returns the receipt of the prices of all purchased items and the total
     * amount due.
     *
     * @return the receipt
     */
    public String getReceipt() {
        if (receipt.isBlank()) return "Amount Due: " + CURRENCY_SYMBOL + "0.00";

        String receipt = this.receipt + "\n";

        double tax = getTotalTax();
        if (tax > 0) receipt += "\nTotal Tax: " + formatAmount(tax);

        receipt += "\nAmount Due: " + formatAmount(getPurchase() + tax);

        return receipt;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     *
     * @return the change due to the customer
     */
    public double giveChange() {
        double change = payment - getPurchase() - getTotalTax();
        
        salesCount++;
        salesTotal += getPurchase() + getTotalTax();

        purchase = 0;
        taxablePurchase = 0;
        payment = 0;
        itemCount = 0;

        return change;
    }

    /**
     * E3.11 Get the number of sales.
     * @return the number of sales
     */
    public int getSalesCount() {
        return salesCount;
    }

    /**
     * E3.11 Get the total amount of money in sales.
     * @return the amount of money in sales
     */
    public double getSalesTotal() {
        return salesTotal;
    }

    /**
     * E3.11 Reset any counters and totals so that the next day's sales start from zero.
     */
    public void reset() {
        salesCount = 0;
        salesTotal = 0;
    }
}
