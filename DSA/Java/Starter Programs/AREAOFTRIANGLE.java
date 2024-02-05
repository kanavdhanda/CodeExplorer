import java.util.Scanner;
class AREAOFTRIANGLE
{
    public static void main(String args[])
    {
        double b,h,a;
        Scanner obj1=new Scanner(System.in);
        System.out.println("tell the height of triangle");
        h=obj1.nextInt();
        System.out.println("Tell the base of triangle");
        b=obj1.nextInt();
        a=b*h*1/2;
        System.out.println("The area of triangle is"+a);
    }
}