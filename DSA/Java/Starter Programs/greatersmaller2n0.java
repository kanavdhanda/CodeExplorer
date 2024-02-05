import java.util.Scanner;
class greatersmaller2n0
{
    public static void main(String args[])
    {
        int a,b;
        Scanner kanav=new Scanner(System.in);
        System.out.println("Please enter the first number");
        a=kanav.nextInt();
        System.out.println("Please enter the second number");
        b=kanav.nextInt();
        if (a>b)
        {
            System.out.print(a);
            System.out.println(" Is Greater");
        }
        else
        {
            System.out.print(b);
            System.out.println(" Is Greater");
        }
    }
}