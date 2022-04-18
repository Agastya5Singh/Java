public class q2 {
    int a;
    static int b;
    void f1()
    {
        a=a+20;
        b=b+5;
    }
    void display()
    {
        System.out.println("a =" + a + "b =" + b);
    }
    public static void main(String[] args)
    {
        q2 x1=new q2();
        q2 x2=new q2();
        x1.f1();
        x2.f1();
        x1.display();
        x2.display();
    }
    
}