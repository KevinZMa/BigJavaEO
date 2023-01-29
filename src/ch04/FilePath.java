package ch04;

import java.io.File;
import java.util.Scanner;

/**
 * Write a program that prompts the user for the drive letter (`C`), the path
 * (`\Windows\System`), the file name (`Readme`), and the extension (`txt`).
 * Then print the complete file name `C:\Windows\System\Readme.txt`. (If you use
 * UNIX or a Macintosh, skip the drive name and use `/` instead of `\` to
 * separate directories.)
 */
public class FilePath {

    public static void main(String[] args) {
        final String SEPARATOR = File.separator; // either "/" or "\\"
        final boolean IS_WINDOWS = SEPARATOR.equals("\\\\");

        Scanner in = new Scanner(System.in);

        String fullPath = "";

        if (IS_WINDOWS) {
            System.out.print("Drive letter: ");
            fullPath += in.next() + ":";
        }

        System.out.print("Folder path (including root): ");
        fullPath += in.nextLine(); // support spaces

        if (!fullPath.endsWith(SEPARATOR))
            fullPath += SEPARATOR;

        System.out.print("File name: ");
        fullPath += in.nextLine();

        System.out.print("Extension: ");
        fullPath += "." + in.next();

        System.out.println(fullPath);

        in.close();
    }
}
