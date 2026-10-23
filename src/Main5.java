public class Main5 {
    public static void main(String[] args) {
        Point[] array = new Point[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Point(i,i);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = new Point(i,i);
            System.out.print(array[i]+" ");
        }

    }
}
