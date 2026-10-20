public class Polygon {
    private Point[] points;

    public Polygon() {
        Point p0 = new Point();
        points = new Point[] {p0};
    }

    public Polygon(Point... points) {
        this.points = points;
    }

    public int getLenght() {
        return points.length;
    }

    public void setOffset(int offX, int offY) {
        for (Point point : points) {
            point.setOffset(offX, offY);
        }
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < points.length; i++) {
            if (i == points.length - 1) {
                value.append(points[i].toString());
            } else {
                value.append(points[i].toString() + " - ");
            }
        }

        return String.valueOf(value);
    }
}
