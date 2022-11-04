public class House {

    public boolean drawn;
    private Square wall = new Square();
    private Square window = new Square();
    private Triangle roof = new Triangle();
    private Circle sun = new Circle();

    /**
     * Draw a house relative to points x and y.
     */
    public void draw(int x, int y) {
        if (drawn) return;

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
