public class q4 {
   
    public static void main(String[] args)
    {

        ABC a1 = new ABC(100, 200);
        a1.display();
        ABC a2 = new ABC(50);
        a2.display();
        ABC a3 = new ABC(a1);
        a3.display();
        
    }
    
}

class ABC
{
    int i,j;

    ABC (int x , int y)
    {
        i = x;
        j = y;
    }

    ABC (int p)
    {
        i = p;
        j = i+p;
    }

    ABC (ABC a11) //parameter of class type
    {
        i = i+a11.i;
        j = j+a11.j;

    }

    
    void display()
    {
        System.out.println("A= "+i+" and B= "+j);
    }
    

}
