public class Ellipse {
    private double a, b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return Math.PI * a * b;
    }
}