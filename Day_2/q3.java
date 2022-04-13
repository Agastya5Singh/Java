public class q3 {

    public static void main(String[] args)
    {
        xyz x1 = new xyz();
        x1.get();
        x1.display();
        xyz x2 = new xyz();
        x2.change(x1);
        x2.display();


    }
    
}

class xyz
{
    int p,q;
    void get()
    {
        p=q=10;
    }

    void change(xyz x11)
    {
        x11.p = x11.p-2;
        x11.q = x11.p-5;
        p = x11.p;
        q = x11.q;


    }

    void display()
    {
        System.out.println("P= "+p+" and q= "+q);
    }

}