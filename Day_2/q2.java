import java.util.*;
public class q2
{
    public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);

      int h,b,p;
      int sqsum;
      int hsq;

System.out.print("Enter first hypotenus ");	
		h = input.nextInt();
		
		System.out.print("Enter base ");	
		b = input.nextInt();	
		
		System.out.print("Enter perpendicular ");	
		p = input.nextInt();	
      
         sqsum = b*b + p*p ;
         hsq= h*h;
        
         if(hsq ==  sqsum ) {
         System.out.print(" triangle is right angle ");
         }
else {
System.out.print(" triangle not right angle  ");
}    
}
}