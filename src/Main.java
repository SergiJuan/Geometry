public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3,5);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("---");

        p1.moveTo(5,2);

        System.out.println(p1);
        System.out.println(p2);
    }
}
