import javax.print.attribute.standard.Sides;
import java.lang.Math;

/**
 * class
 */
class GeometricObject
{

}
class Triangle extends GeometricObject
{
    double side1=1,side2=1,side3=1;
    Triangle(){}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea()
    {
        double s=(side1+side2+side3)/2;
        double A=s*(s-side1)*(s-side2)*(s-side3);
        double area=Math.sqrt(A);
        return area;
    }
    public double getPerimeter()
    {
        double Perimeter=side1+side2+side3;
        return Perimeter;
    }
    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + 
        side3;  
    }
}
 class ass_6 {

    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.setSide1(3);
        t.setSide2(4);
        t.setSide3(5);
        double area=t.getArea();
        double peri=t.getPerimeter();
        String st=t.toString();
        System.out.println(area);
        System.out.println(peri);
        System.out.println(st);
    }
}

