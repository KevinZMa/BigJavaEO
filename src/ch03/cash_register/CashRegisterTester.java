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

        expect(register.getPurchase(), 50.0);

        String expectedReceipt =
            "$30.00\n$20.00 (taxable)\n\nTotal Tax: $1.80\nAmount Due: $51.80";
        expect(register.getReceipt(), expectedReceipt);

        register.receivePayment(60);

        expect(register.getItemCount(), 2);
        expect(register.giveChange(), 8.2);
    }

    private static void expect(Object resultObject, Object expectedObject) {
        // cast to string
        String result = String.valueOf(resultObject);
        String expected = String.valueOf(expectedObject);

        // TODO: inconsistencies with newlines across operating systems
        if (result.contains("\n") || expected.contains("\n")) {
            System.out.println("Received: ");
            printWithNewlines(result);
            System.out.println("Expected: ");
            printWithNewlines(expected);
        } else {
            System.out.println("Received: " + result);
            System.out.println("Expected: " + expected);
        }
    }

    private static void printWithNewlines(String str) {
        System.out.printf("\"\"\"%n%s%n\"\"\"%n", str);
    }
}
