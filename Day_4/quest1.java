import java.util.Scanner;
class StudentInfo{
    String name="Agastya";
    String add="KIIT";
    String branch="CSCE";
    String dept="Computer Science";
    public void display(){
        System.out.println("Student Details");
        System.out.println("Name: "+name);
        System.out.println("Address: "+add);
        System.out.println("Branch: "+branch);
        System.out.println("Department: "+dept);

    }
}
class StudentRegular extends StudentInfo{

}
class StudentETC extends StudentInfo{
int marks;
float attendence;
    Scanner sc=new Scanner(System.in);
    public void get(){
        System.out.println("Enter marks and attendence");
         marks=sc.nextInt();
        attendence=sc.nextFloat();
    }
@Override
public void display(){
    System.out.println("Student Details");
    System.out.println("Name: "+name);
    System.out.println("Address: "+add);
    System.out.println("Branch: "+branch);
    System.out.println("Department: "+dept);
    System.out.println("Marks: "+marks);
    System.out.println("Attendence: "+attendence+"%");
}
}
public class quest1 {
    public static void main(String[] args) {
      StudentETC s1=new StudentETC();
      s1.get();
      s1.display();
    }
}