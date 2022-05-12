class q1 {

    String name;
    String address;
    String branch;
    String departement;
}

// Test (Main) class
class studentInfo {

    public static void main(String[] args) {
        // creating objects of class Student
        q1 st1 = new q1();
        q1 st2 = new q1();

        // assigning values to attribute name for objects
        st1.name = "Agastya";
        st1.address = "Gorakhpur";
        st1.branch = "CSCE";
        st1.departement = "Computer science";
        st2.name = "Singh";
        st2.address = "Delhi";
        st2.branch = "CSCE";
        st2.departement = "Computer science";
     
        System.out.println("Student 1 Name: " + st1.name);
        System.out.println("Student 1 address: " + st1.address);
        System.out.println("Student 1 branch: " + st1.branch);
        System.out.println("Student 1 departement: " + st1.departement);
        System.out.println("Student 2 Name: " + st2.name);
        System.out.println("Student 2 address: " + st2.address);
        System.out.println("Student 2 branch: " + st2.branch);
        System.out.println("Student 2 departement: " + st2.departement);
    }
}
class studentRegulator extends studentInfo{
    int marks;
    int attendance;  
}
 super(marks,attendance);
    

class studentETC extends studentRegulator{
    // public static void main(String[] args) {
    //     // creating objects of class Student
    //     q1 st1 = new q1();
    //     q1 st2 = new q1();

        st1.marks = "55";
        st1.attendance = "90%";



}
