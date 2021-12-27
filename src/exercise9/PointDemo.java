package exercise9;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1, 2);

        System.out.println("Enter point 3:");
        Point point3 = new Point();
        point3.initialize();

        Point point4 = new Point(point3);
        Point point5 = point2.createNewTranslatedPoint(1, 2);
        Point point6 = point2;

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Point 3: " + point3);
        System.out.println("Point 4: " + point4);
        System.out.println("Point 5: " + point5);
        System.out.println("Point 6: " + point6);

        point2.translate(4, 5);
        System.out.println("Translated point 2: " + point2);
        System.out.println("Translated point 6: " + point6);

        System.out.println("Point 1 equals point 5: " + point1.equals(point5));

        point1.translate(2, 4);
        System.out.println("Translated point 1 equals point 5: " + point1.equals(point5));
    }
}
