import java.lang.StringBuilder;
import java.util.Scanner;

public class StringExtra {

    public static void main(String[] args) {
        StringExtra strEx = new StringExtra();
        strEx.reverseInput();
    }

    public void reverseInput() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Input: ");
            String input = in.nextLine();
            StringBuilder builder = new StringBuilder();
            builder.append(input);
            builder.reverse();
            System.out.println(builder);
        } finally {
            in.close();
        }
    }
}
