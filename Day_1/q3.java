class x
{
  int a , b , c;
  public void get(int i , int j , int k)
  {
      a=i;
      b=j;
      c=k;
  }
  public void add(x obj1 , x obj2)
  {
      a = obj1.a+obj2.a;
      b = obj1.b+obj2.b;
      c = obj1.c+obj2.c;
  }
  public void diaplay()
  {
      System.out.println("a :" + a + " b :" + b + " c : " + c);
  }
}
public class q3 {

    public static void main(String[] args) {
	x obj1 = new x();
    x obj2 = new x();
    x obj3 = new x();
    obj1.get(3 ,7 ,8 );
    obj2.get(4,5,8);
    obj3.add(obj1 , obj2);
    obj1.diaplay();
    obj2.diaplay();
    obj3.diaplay();
    }
}