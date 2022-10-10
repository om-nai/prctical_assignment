/**
 * PR10
 */
interface Comparable
{
    int compareTo(ComparableSquare S);
}
class Square
{
    private int a;
    Square(){}
    public int getA()
    {
        return a;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public int getArea()
    {
        return a*a;
    }
}
class ComparableSquare extends Square implements Comparable
{
    public int compareTo(ComparableSquare S)
    {
        if(this.getArea()>S.getArea())
        {
            return 1;
        }
        else if(this.getArea()<S.getArea())
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }
}
public class ass_10{
    public static void main(String[] args) {
        ComparableSquare s1=new ComparableSquare();
        ComparableSquare s2=new ComparableSquare();
        s1.setA(2);
        s2.setA(3);
        int x=s1.compareTo(s2);
        if(x==1)
        {
            System.out.println("Square 1 is bigger than Square 2");
        }
        else{
            System.out.println("Square 2 is bigger than Square 1");
        }
    }
    
}

