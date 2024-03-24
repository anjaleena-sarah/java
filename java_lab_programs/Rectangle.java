public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public double calculateArea() {
        return length * width;
    }
    public int sameArea(Rectangle other) {
        double area1 = this.calculateArea();
        double area2 = other.calculateArea();
        if (area1 == area2) {
            return 1;
        } else {
            return 0;
        }
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 4);
        Rectangle rectangle2 = new Rectangle(4, 5);
        System.out.println("Perimeter of rectangle1: " + rectangle1.calculatePerimeter());
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());

        System.out.println("Perimeter of rectangle2: " + rectangle2.calculatePerimeter());
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());

        System.out.println("Are the areas of rectangle1 and rectangle2 the same? " + rectangle1.sameArea(rectangle2));
    }
}
