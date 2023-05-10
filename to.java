interface Shape {
  void draw();
  double area();
}

class GeometricObject {
  // Class implementation details
}

class Circle extends GeometricObject implements Shape {
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }
  
  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }
  
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends GeometricObject implements Shape {
  private double length;
  private double width;
  
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }
  
  @Override
  public double area() {
    return length * width;
  }
}

public class to {
  public static void main(String[] args) {
    Shape s = new Circle(5.0);
    s.draw();
    System.out.println("Area of circle: " + s.area());
    
    s = new Rectangle(3.0, 4.0);
    s.draw();
    System.out.println("Area of rectangle: " + s.area());
  }
}