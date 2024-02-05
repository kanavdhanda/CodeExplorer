import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner kanav=new Scanner(System.in);
        System.out.println("Please enter first Number");
        a=kanav.nextInt();
        System.out.println("Please enter Second Number");
        b=kanav.nextInt();
        c=a+b;
        System.out.println("The sum is"+c);
    }
}
