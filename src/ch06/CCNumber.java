package ch06;

/**
 * Check that the credit card number is valid.
 *
 * A credit card number is valid when the following is divisible by 10:
 *
 * Form the sum of all digits. Add to that sum every second digit, starting with
 * the second digit from the right. Then add the number of digits in the second
 * step that are greater than four. The result should be divisible by 10.
 *
 * @bj.project P6.1
 */
public class CCNumber {

    public static void main(String[] args) {
        String creditCardNumber = args.length > 0
            ? String.join("", args)
            : "4012 8888 8888 1881";

        creditCardNumber = creditCardNumber.replace(" ", "").replace("-", "");

        int len = creditCardNumber.length();

        int sum = 0;
        int sum2 = 0;
        int greaterThanFour = 0;
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(creditCardNumber.substring(i, i + 1));

            sum += num;
            if ((len - i) % 2 == 0) {
                sum2 += num;
                if (num > 4) {
                    greaterThanFour++;
                }
            }
        }

        System.out.println(creditCardNumber);
        System.out.println(
            (sum + sum2 + greaterThanFour) % 10 == 0 ? "Valid" : "Invalid"
        );
    }
}
