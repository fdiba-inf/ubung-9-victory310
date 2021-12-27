package exercise9;

public class Rectangle {
    private Point startPoint;
    private double height;
    private double width;

    public Rectangle() {
        startPoint = new Point(0, 0);
        height = 1;
        width = 1;
    }

    public Rectangle(Point startPoint, double height, double width) {
        this.startPoint = new Point(startPoint);
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle otherRectangle) {
        startPoint = new Point(otherRectangle.startPoint);
        height = otherRectangle.height;
        width = otherRectangle.width;
    }

    public boolean isValid() {
        return height > 0 && width > 0;
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("Enter height: ");
            height = Utils.INPUT.nextDouble();
            System.out.print("Enter width: ");
            width = Utils.INPUT.nextDouble();
        } while (!isValid());
    }

    public double calculatePerimeter() {
        return height * 2 + width * 2;
    }

    public double calculateArea() {
        return height * width;
    }

    public String getType() {
        return (height == width) ? "Square" : "Rectangle";
    }

    public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, height, width, getType(), calculatePerimeter(), calculateArea());
    }

    public boolean equal(Rectangle otherRectangle) {
        boolean sameHeight = Utils.equals(height, otherRectangle.height);
        boolean sameWidth = Utils.equals(width, otherRectangle.width);
        boolean sameHeightReversed = Utils.equals(height, otherRectangle.width);
        boolean sameWidthReversed = Utils.equals(width, otherRectangle.height);

        return (sameHeight && sameWidth) || (sameHeightReversed && sameWidthReversed);
    }
}
