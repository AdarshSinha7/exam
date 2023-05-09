import java.util.Scanner;

interface Square {
  double calculateArea(double side);
}

interface Circle {
  double computeArea(double radius);
}

class AreaCalculator implements Square, Circle {
  
  public double calculateArea(double side) {
    return side * side;
  }
  
  
  public double computeArea(double radius) {
    return Math.PI * radius * radius;
  }
}

class Area {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AreaCalculator calculator = new AreaCalculator();
    
    // Take input for square side length
    System.out.print("Enter side length of square: ");
    double side = scanner.nextDouble();
    
    // Compute and print area of square
    double squareArea = calculator.calculateArea(side);
    System.out.println("Area of square with side " + side + " is " + squareArea);
    
    // Take input for circle radius
    System.out.print("Enter radius of circle: ");
    double radius = scanner.nextDouble();
    
    // Compute and print area of circle
    double circleArea = calculator.computeArea(radius);
    System.out.println("Area of circle with radius " + radius + " is " + circleArea);
  }
}
