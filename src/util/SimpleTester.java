package util;

public class SimpleTester {

    public static void expect(Object result, Object expected) {
        // TODO: inconsistencies with newlines across operating systems
        if (
            String.valueOf(result).contains("\n") ||
            String.valueOf(expected).contains("\n")
        ) {
            System.out.println("Received: ");
            printWithNewlines(result);
            System.out.println("Expected: ");
            printWithNewlines(expected);
        } else {
            System.out.println("Received: " + result);
            System.out.println("Expected: " + expected);
        }
    }

    private static void printWithNewlines(Object obj) {
        System.out.printf("\"\"\"%n%s%n\"\"\"%n", obj);
    }
}
