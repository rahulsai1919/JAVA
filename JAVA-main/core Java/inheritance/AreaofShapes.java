package inheritance;

class Shape
{
    private String name;
    Shape(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    double getArea()
    {
        double area = 0.0;
        return area;
    }
}

class Rectangle extends Shape
{
    private double length;
    private double breadth;
    Rectangle(double length,double breadth)
    {
        super("Reactangle");
        this.length = length;
        this.breadth = breadth;
    }
    double getArea()
    {
        return length * breadth;
    }
}

class Square extends Shape{
    private double sidelength;

    public Square(double sidelength) {
        super("Square");
        this.sidelength = sidelength;
    }
    double getArea() {
        return sidelength*sidelength;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
}
public class AreaofShapes {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4);
        System.out.println("Area of rectangle is " + r.getArea());

        Square s= new Square(4);
        System.out.println("Area of square is " + s.getArea());

        Circle c = new Circle(2.5);
        System.out.println("Area of circle is " + c.getArea());
    }

}
