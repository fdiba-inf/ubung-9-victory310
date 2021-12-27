package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {

        Ellipse ellipse1 = new Ellipse();
        Point startPoint2 = new Point(2, 3);
        Ellipse ellipse2 = new Ellipse(startPoint2, 5, 6);
        Ellipse ellipse3 = new Ellipse(ellipse2);
        Ellipse ellipse4 = new Ellipse();
        ellipse4.initialize();

        System.out.println("Ellipse 1: " + ellipse1);
        System.out.println("Ellipse 2: " + ellipse2);
        System.out.println("Ellipse 3: " + ellipse3);
        System.out.println("Ellipse 4: " + ellipse4);
      
        System.out.println("Ellipse 2 equals Ellipse 1: " + ellipse2.equals(ellipse1));
        System.out.println("Ellipse 2 equals Ellipse 3: " + ellipse2.equals(ellipse3));

    }
}
