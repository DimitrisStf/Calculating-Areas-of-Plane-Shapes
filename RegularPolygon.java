public class RegularPolygon {
    private int sides;
    private double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        if (sides < 3) throw new IllegalArgumentException("Polygon needs ≥3 sides");
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double area() {
        return (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / sides));
    }
}
