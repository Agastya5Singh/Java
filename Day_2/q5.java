// c1.add(c2,c3)
// c3=c1.add(c2)

class Sum
{
    int a, b;
    Sum()
    {

    }
    Sum(int x, int y)
    {
        a = x;
        b = y;
    }
    void add(Sum X11, Sum Y11)
    {
        a = X11.a + Y11.a;
        b = X11.b + Y11.b;
    }
    Sum add(Sum temp)
    {
        a = a + temp.a;
        b = b + temp.b;
        return this;
    }
    void Display()
    {
        System.out.println("a = "+a+" b = "+b);
    }

}

public class q5 
{
    public static void main(String[] args) 
    {
        Sum x1 = new Sum(2,5);
        Sum x2 = new Sum(3,6);
        Sum x3 = new Sum();
        Sum x4 = new Sum();
        x3.add(x1, x2);
        x4 = x1.add(x2);
        x3.Display();
        x4.Display();
    }
}