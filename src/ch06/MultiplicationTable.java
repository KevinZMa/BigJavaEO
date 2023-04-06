package ch06;

/**
 * Prints a 10x10 multiplication table.
 *
 * @bj.exercise E6.16
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
    }
}
