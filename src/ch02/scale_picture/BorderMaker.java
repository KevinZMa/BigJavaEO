package ch02.scale_picture;

public class BorderMaker {

    public static void main(String[] args) {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        int newWidth = pic.getWidth() - 40;
        int newHeight = pic.getHeight() - 40;
        pic.scale(newWidth, newHeight);
        pic.move(20, 20);
        pic.border(10);
    }
}
