public class Polygon {
    private Point[] points;

    public Polygon() {
        Point p0 = new Point();
        points = new Point[] {p0};
    }

    public Polygon(Point... points) {
        this.points = points;
    }

    public double getLenght() {
        double lenght = 0;
        for (int i = 0; i < points.length - 1; i++) {
            Segment side = new Segment(points[i], points[i+1]);
            lenght += side.getModule();
        }
        Segment side = new Segment(points[points.length - 1], points[0]);
        lenght += side.getModule();

        return lenght;
    }


    public void setOffset(int offX, int offY) {
        for (Point point : points) {
            point.setOffset(offX, offY);
        }
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        for (int i = 0; i <= points.length; i++) {
            if (i == points.length) {
                value.append(points[0].toString());
            } else {
                value.append(points[i].toString() + " - ");
            }
        }

        return String.valueOf(value);
    }
}
