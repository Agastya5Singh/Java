//Write a program to implement static member and static method.
class Student{  
    int rollno;
    String name;  
    static String college ="KIIT";
    //constructor  
    Student(int r, String n)
    {  
    rollno = r;  
    name = n;  
    }  
  
    void display ()
    {
      System.out.println(rollno+" "+name+" "+college);
    }  
  }  
  public class q3{  
  public static void main(String args[])
  {  
  Student s1 = new Student(142,"Agastya");  
  Student s2 = new Student(000,"Xyz"); 
  //Student.college="IIT";  
  s1.display();  
  s2.display();  
  }  
  }