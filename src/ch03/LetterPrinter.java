package ch03;

/**
 * E3.15 Prints a simple letter.
 */
public class LetterPrinter {

    public static void main(String[] args) {
        Letter letter = new Letter("Mary", "John");

        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");

        System.out.println(letter.getText());
    }
}
