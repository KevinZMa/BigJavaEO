package ch02.scale_picture;

/**
 * E2.17 Using the Picture class of Worked Example 2.2, write a HalfSizePicture program that loads a picture and shows it at half the original size, centered in the window.
 */
public class HalfSizePicture {

    public static void main(String[] args) {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.scale(pic.getWidth() / 2, pic.getHeight() / 2);
        pic.move(pic.getWidth() / 2, pic.getHeight() / 2);
    }
}
