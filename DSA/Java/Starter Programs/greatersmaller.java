import java.util.Scanner;
class greatersmaller
{
    public static void main(String args[])
    {
        int a,b;
        Scanner kanav=new Scanner(System.in);
        System.out.println("Please enter the first number");
        a=kanav.nextInt();
        System.out.println("Please enter the second number");
        b=kanav.nextInt();
        int c= Math.max(a,b);
        System.out.print(c);
        System.out.print(" Is Greater");
    }
}