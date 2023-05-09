import java.util.Scanner;

interface Shape {
   public double getArea();
}

class Rectangle implements Shape {
   private double length;
   private double breadth;

   public Rectangle(double length, double breadth) {
      this.length = length;
      this.breadth = breadth;
   }

   public double getArea() {
      return length * breadth;
   }
}

class Triangle implements Shape {
   private double base;
   private double height;

   public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
   }

   public double getArea() {
      return 0.5 * base * height;
   }
}

class Circle implements Shape {
   private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return Math.PI * radius * radius;
   }
}

public class InterfaceExample {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter length & width of rectangle :\t");
      double length = sc.nextDouble();
      double width = sc.nextDouble();

      System.out.print("Enter height & base length of triangle :\t");
      double height = sc.nextDouble();
      double base = sc.nextDouble();

      System.out.print("Enter radius of circle :\t");
      double radius = sc.nextDouble();
      
      Rectangle rectangle = new Rectangle(length, width);
      Triangle triangle = new Triangle(base, height);
      Circle circle = new Circle(radius);

      System.out.println("Area of Rectangle: " + rectangle.getArea());
      System.out.println("Area of Triangle: " + triangle.getArea());
      System.out.println("Area of Circle: " + circle.getArea());
   }
}
