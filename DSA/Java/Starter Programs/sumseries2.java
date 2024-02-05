import java.util.Scanner;
class sumseries2
{
    public static void main(String args[])
    {
        double i,n,s;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the number");
        s=0;
        n=jj.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+(Math.pow(i,3));
        }
        System.out.println(s);
    }
}