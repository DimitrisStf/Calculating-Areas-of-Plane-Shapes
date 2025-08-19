import java.util.Scanner;

public class SHAPEAREA2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("Type the number to calculate the area of the shape you want. Each number corresponds to a different shape");
            System.out.println("\n--- MENU ---");
            System.out.println("1) Rectangle");
            System.out.println("2) Triangle");
            System.out.println("3) Circle");
            System.out.println("4) Regular Polygon");
            System.out.println("5) Ellipse");
            System.out.println("6) Trapezoid");
            System.out.println("0) Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.println("Give the width of the Rectangle");
                    double width=in.nextDouble();
                    System.out.println("Give the heigth of the Rectangle");
                    double height=in.nextDouble();
                    if (width<=0 || height <0){System.out.println("Dimensions must be posisitve");
                        break;}
                    Rectangle r = new Rectangle(width,height);
                    System.out.printf("Area: %.2f%n", r.area());
                    break;
                case 2:
                    System.out.print("GIVE BASE OF THE TRIANGLE");
                    double base=in.nextDouble();
                    System.out.print("GIVE HEIGHT OF THE TRIANGLE");
                    double heigt=in.nextDouble();
                    if (base<=0 || heigt <0){System.out.println("Dimensions must be posisitve");
                        break;}
                    Triangle t = new Triangle(base,heigt);
                    System.out.printf("Area: %.2f%n", t.area());
                    break;
                case 3:
                    
                    System.out.print("GIVE THE RADIUS OF THE CIRCLE ");
                    double radius=in.nextDouble();
                    if (radius <= 0) {
                    System.out.println("Radius must be positive!");
                    break;}
                    Circle c = new Circle(radius);
                    System.out.printf("Circlelength: %.2f, Area: %.2f%n",
                                      c.circlelength(), c.area());
                    break;
                case 4:
                    System.out.print(" Give the number of sides and the length of one side : ");
                    
                    RegularPolygon p = new RegularPolygon(in.nextInt(), in.nextDouble());
                    
                    System.out.printf("Area: %.2f%n", p.area());
                    break;
                case 5:
                    System.out.print("Give length of two semi-axes: ");
                    Ellipse e = new Ellipse(in.nextDouble(), in.nextDouble());
                    System.out.printf("Area: %.2f%n", e.area());
                    break;
                case 6:
                    System.out.println("Give length of small base");
                    double b = in.nextDouble();
                    System.out.println("Give length of large base");
                    double B = in.nextDouble();
                    System.out.println("Give the height of trapezoid");
                    double h = in.nextDouble();
                    Trapezoid f = new Trapezoid(b, B, h);
                    System.out.printf("Area: %.2f%n", f.area());
                break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        in.close();
    }
}