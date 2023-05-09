import java.util.*;
abstract class ShapeTest
{ double a,b;
    ShapeTest(double x,double y)
    { a=x;
        b=y; }
    abstract void area();
}
class RectangleTest extends ShapeTest
{ RectangleTest(double x, double y)
{ super(x,y); }
    void area() {System.out.println("Area of Rectangle=="+a*b);}
}
class TriangleTest extends ShapeTest
{ TriangleTest(double x, double y)
{ super(x,y); }
    void area() {System.out.println("Area of Triangle=="+0.5*a*b);}
}
class CircleTest extends ShapeTest
{ CircleTest(double x, double y)
{ super(x,y); }
    void area() {System.out.println("Area of Circle=="+a*b*b);}
}
class Abstract2{ public static void main(String ar[])
{ Scanner sc= new Scanner(System.in);
    System.out.println("Enter triangle sides");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    TriangleTest tr= new TriangleTest(a,b);
    System.out.println("Enter Rectangle sides");
    double l=sc.nextDouble();
    double w=sc.nextDouble();
    RectangleTest rt=new RectangleTest(l,w);
    System.out.println("Enter vale of Pi and Radius of circle");
    double p=sc.nextDouble();
    double r=sc.nextDouble();
    CircleTest cr=new CircleTest(p,r);
    tr.area();
    rt.area();
    cr.area();
}
}
