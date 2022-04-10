class x{
    int a,b,c;
    void get(int i,int j,int k){
        a=i;
        b=j;
        c=k;
    }
    int volume(){
        int p;
         p=a*b*c;
         return p;
    }
}
class q4 {
    public static void main(String[] args) {
      x x1=new x();
      x x2=new x();
      x1.get(2,3,4);
      x2.get(7,9,10);
      System.out.println(" 1st volume is:"+ x1.volume());
      System.out.println(" 2nd volume is:"+ x2.volume());
    }
}