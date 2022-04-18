public class q1
{
    int a;
    static int b;
    public static void main(String[] args)
    {
        q1 x2=new q1();
        q1 x1=new q1();
        x1.a=10;
        x1.b=20;
        x2.a=8;
        System.out.println(x1.a);
        System.out.println(x1.b);
        System.out.println(x2.a);
        System.out.println(x2.b);
    }
}