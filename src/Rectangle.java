public class Rectangle extends Point {
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point p, int width, int height) {
        super(p.getX(), p.getY());
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " width: " + width + " height: " + height;
    }
}
