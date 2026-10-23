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

    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p1.getY());
        this.width = p2.getX() - p1.getX();
        this.height = p2.getY() - p1.getY();
    }

    public Rectangle(Segment seg) {
        super(seg.getStartPoint().getX(), seg.getStartPoint().getY());
        this.width = seg.getEndPoint().getX() - seg.getStartPoint().getX();
        this.height = seg.getEndPoint().getY() - seg.getStartPoint().getY();
    }

    public int getArea() {
        return width * height;
    }

    public Point getPoint() {
        return new Point(super.getX(), super.getY());
    }

    public Point getTopLeftPoint() {
        return new Point(super.getX(), super.getY() + height);
    }

    public Point getTopRightPoint() {
        return new Point(super.getX() + width, super.getY() + height);
    }

    public Point getBottomLeftPoint() {
        return new Point(super.getX(), super.getY());
    }

    public Point getBottomRightPoint() {
        return new Point(super.getX() + width, super.getY());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " width: " + width + " height: " + height;
    }
}
