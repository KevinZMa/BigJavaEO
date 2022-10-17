/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 *
 * @author  Michael K�lling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture {

    /**
     * Draw this picture.
     */
    public void draw() {
        drawHouse(100, 0);
        drawHouse(-100, 0);
    }

    /**
     * Draw a house relative to points x and y.
     */
    public void drawHouse(int x, int y) {
        Square wall = new Square();
        Square window = new Square();
        Triangle roof = new Triangle();
        Circle sun = new Circle();

        wall.moveHorizontal(x - 140);
        wall.moveVertical(y + 20);
        wall.changeSize(120);
        wall.makeVisible();

        window.changeColor("black");
        window.moveHorizontal(x - 120);
        window.moveVertical(y + 40);
        window.changeSize(40);
        window.makeVisible();

        roof.changeSize(60, 180);
        roof.moveHorizontal(x + 20);
        roof.moveVertical(y - 60);
        roof.makeVisible();

        sun.changeColor("yellow");
        sun.moveHorizontal(x);
        sun.moveVertical(y - 85);
        sun.changeSize(80);
        sun.makeVisible();
        drawn = true;
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
