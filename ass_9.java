class Square extends GeometricObject implements Colorable{

    private double side;
    
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square() {
        side = 0;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square: side = " + side;
    }

    public void print() {
        System.out.println("Perimeter of Square: " + getPerimeter());
        System.out.println("Area of Square: " + getArea());
    }
    
}
class Object_square_main {

    public static void main(String[] args) {
        
        Square s1 = new Square();
        Square s2 = new Square(8.9);

        //Default Square
        System.out.println(s1.toString());
        s1.print();
        s1.howToColor();
        System.out.println();
        
        System.out.println(s2.toString());
        s2.print();
        s2.howToColor();
       
    }

}
interface Colorable {

    public void howToColor();
    
}
abstract class GeometricObject {

    public  abstract double getPerimeter();
    public abstract double getArea();
    
}
public class ass_9{

    public static void main(String[] args) {
        
        Square s1 = new Square();
        Square s2 = new Square(8.9);

        //Default Square
        System.out.println(s1.toString());
        s1.print();
        s1.howToColor();
        System.out.println();
        
        System.out.println(s2.toString());
        s2.print();
        s2.howToColor();
       
    }
}


