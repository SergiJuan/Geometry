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

    @Override
    public String toString() {
        return super.toString() + " width: " + width + " height: " + height;
    }
}
