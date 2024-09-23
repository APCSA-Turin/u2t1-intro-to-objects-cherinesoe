public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public void printArea() {
        double area = Math.PI * (radius*radius); 
        System.out.println("A circle with radius " + radius + " has an area of " + area);
    }
}