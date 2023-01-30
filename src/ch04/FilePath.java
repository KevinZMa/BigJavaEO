package ch04;

import java.io.File;
import java.util.Scanner;

/**
 * Write a program that prompts the user for the drive letter (`C`), the path
 * (`\Windows\System`), the file name (`Readme`), and the extension (`txt`).
 * Then print the complete file name `C:\Windows\System\Readme.txt`. (If you use
 * UNIX or a Macintosh, skip the drive name and use `/` instead of `\` to
 * separate directories.)
 *
 * @bj.exercise E4.11
 */
public class FilePath {

    public static void main(String[] args) {
        final String SEPARATOR = getSeparator(); // either "/" or "\\"
        final boolean IS_WINDOWS = SEPARATOR.equals("\\");

        Scanner in = new Scanner(System.in);

        String fullPath = "";

        if (IS_WINDOWS) {
            System.out.print("Drive letter: ");
            fullPath += in.next() + ":";
            in.nextLine(); // discard rest of the line
        }

        System.out.print("Folder path (including root): ");
        String filePath = in.nextLine(); // support spaces
        if (!filePath.startsWith(SEPARATOR)) filePath = SEPARATOR + filePath;
        fullPath += filePath;

        if (!fullPath.endsWith(SEPARATOR)) fullPath += SEPARATOR;

        System.out.print("File name: ");
        fullPath += in.nextLine();

        System.out.print("Extension: ");
        fullPath += "." + in.next();

        System.out.println(); // separate input and output
        System.out.println(fullPath);

        in.close();
    }

    private static String getSeparator() {
        // test another operating system
        final String DEBUG = System.getenv("DEBUG");
        // prettier-ignore
        if (DEBUG != null && !DEBUG.isBlank())
            return File.separator.equals("/")
                ? "\\"
                : "/";
        return File.separator;
    }
}
