   public class Trapezoid {
    private double B, b, h;

    public Trapezoid(double b, double B, double h) {
        this.B = B;
        this.b = b;
        this.h = h;
    }

    public double area() {
        return (B + b) * h / 2;
    }
}