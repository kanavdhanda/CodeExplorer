import java.util.Scanner;
class AREAOFCIRCLE
{
    public static void main(String args[]) 
    {
        double p,r,a;
        Scanner obj1=new Scanner(System.in);
        p=3.14;
        System.out.println("Tell the radius of the circle");
        r=obj1.nextInt();
        a=p*r*r;
        System.out.print("area of circle="+a);
        System.out.print("cm");
    }
}