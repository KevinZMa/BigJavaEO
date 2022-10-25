import java.lang.StringBuilder;
import java.util.Scanner;

public class StringExtra {

    public static void main(String[] args) {
        StringExtra strEx = new StringExtra();
        strEx.reverseInput();
    }

    public void reverseInput() {
        Scanner console = new Scanner(System.in);
        System.out.print("Input: ");
        String input = console.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        builder.reverse();
        System.out.println(builder);
    }
}
