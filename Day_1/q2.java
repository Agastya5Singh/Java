import java.util.Scanner;

class q2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextInt(), si;
        if (principal <= 7000) 
        {
            si = principal * 0.06* 1;
        }
        else if (principal > 7000 && principal <= 10000)
        {
            si = principal * 0.08* 1;
        }
        else 
        {
            si = principal * 0.1;
        }
        System.out.println("Simple Interest is " + si);
    }
}