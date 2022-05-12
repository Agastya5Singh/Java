import java.util.Scanner;
class first{
    double height;
    double length;
    double vol1;
    double vol2;
    public void get(){
        System.out.println("Enter height and length");
        Scanner sc=new Scanner(System.in);
        height=sc.nextDouble();
        length=sc.nextDouble();
    }
    public void volume(){
         vol1= (22*length*length*height)/(3*7);
         vol2=(length*length*height);
    }
}
class second extends first{
    public void volume(){
        super.volume();
        System.out.println("Volume of cone: "+vol1);

        System.out.println("Volume of square prism: "+vol2);
    }
}
public class quest2 {
    public static void main(String[] args) {
     second x1=new second();
     x1.get();
     x1.volume();
    }
}