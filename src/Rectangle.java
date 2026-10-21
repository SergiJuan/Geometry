public class Rectangle extends Point {
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " width: " + width + " height: " + height;
    }
}
