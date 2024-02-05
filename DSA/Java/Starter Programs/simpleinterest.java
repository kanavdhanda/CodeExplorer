import java.util.Scanner;
class simpleinterest
{
    public static void main(String args[])
    {
        double i,r,p,t,a;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Please tell the principle");
        p=obj1. nextInt();
        System.out.println("Please tell the rate of interest");
        r=obj1.nextInt();
        System.out.println("Tell the time you have taken money for");
        t=obj1.nextInt();
        i=(p*r*t)/100;
        System.out.println("The interest is="+i);
        a=i+p;
        System.out.println("The amount you need to payback is="+a);
        System.out.println("Thank You");
    }
}