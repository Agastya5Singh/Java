//IMPLEMENT A CLASS Rat HAVING DATA MEMBER NUM AND DENUM.INCLUDE APPROPRIATE CONSTRUCTOR AND SOLVE THE FOLLOWING:
//Rat ADD (Rat)
//Rat SUB(Rat) 
//BOOLEAN EQUAL(Rat)
//and display using show function.

class Rat{
    int num;
    int denum;
    public Rat(int n,int d){
      num=n;
      denum=d;
    }
    public Rat add(Rat r){
      Rat r1=new Rat(num*r.denum+r.num*denum,denum*r.denum);
      return r1;
    }
    public Rat sub(Rat r){
      Rat r1=new Rat(num*r.denum-r.num*denum,denum*r.denum);
      return r1;
    }
    public boolean equal(Rat r){
      if(num*r.denum==r.num*denum)
        return true;
      else
        return false;
    }
    public void show(){
      System.out.println(num+"/"+denum);
    }
  }
  public class q4{
    public static void main(String args[]){
      Rat r1=new Rat(1,2);
      Rat r2=new Rat(2,3);
      Rat r3=r1.add(r2);
      Rat r4=r1.sub(r2);
      boolean b=r1.equal(r2);
      r1.show();
      r2.show();
      r3.show();
      r4.show();
      System.out.println(b);
    } 
  }