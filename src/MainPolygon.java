public class MainPolygon {
    public static void main(String[] args) {
        Point p1 = new Point(3, 6);
        Point p2 = new Point(6,3);
        Point p3 = new Point(7,2);
        Point p4 = new Point(4,4);

        Polygon polygon = new Polygon(p1,p2,p3,p4);

        System.out.println(polygon);

        polygon.setOffset(4,4);

        System.out.println(polygon);
    }
}
