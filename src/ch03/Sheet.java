package ch03;

/*
 * P3.4 A sheet following the ISO 216 standard for paper sizes.
 * ISO 216 paper sizes have the same aspect ratio (sqrt2 : 1) when folded widthways.
 */
public class Sheet {

    private int width;
    private int height;
    private int paperSize;

    /**
     * Creates an A0 sheet of paper.
     */
    public Sheet() {
        width = 841;
        height = 1189;
        paperSize = 0;
    }

    /**
     * Cuts the paper in half on the short side. The new height is the width, and
     * the width is halved.
     * @return the new sheet
     */
    public Sheet cutInHalf() {
        Sheet sheet = new Sheet();
        sheet.width = height / 2;
        sheet.height = width;
        sheet.paperSize = paperSize + 1;
        return sheet;
    }

    public String name() {
        return "A" + paperSize;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    /**
     * Unit Testing
     */
    public static void main(String[] args) {
        Sheet sheet = new Sheet();
        printSheet(sheet);
        System.out.println("Expected: 841 x 1189 (A0)");

        sheet = sheet.cutInHalf();
        printSheet(sheet);
        System.out.println("Expected: 594 x 841 (A1)");

        sheet = sheet.cutInHalf();
        printSheet(sheet);
        System.out.println("Expected: 420 x 594 (A2)");
    }

    private static void printSheet(Sheet sheet) {
        System.out.printf(
            "%d x %d (%s) %n",
            sheet.width(),
            sheet.height(),
            sheet.name()
        );
    }
}
