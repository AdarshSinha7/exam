import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double breadth;
    
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    //87@Override
    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class DMD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Calculate area of rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        Shape shape = new Rectangle(length, breadth);//****imp
        double rectangleArea = shape.calculateArea();
        System.out.println("Area of rectangle is: " + rectangleArea);
        
        // Calculate area of triangle
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        shape = new Triangle(base, height);
        double triangleArea = shape.calculateArea();
        System.out.println("Area of triangle is: " + triangleArea);
        
        // Calculate area of circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        shape = new Circle(radius);
        double circleArea = shape.calculateArea();
        System.out.println("Area of circle is: " + circleArea);
    }
}
