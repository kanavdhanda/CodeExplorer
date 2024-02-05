import java.util.Scanner;
class sumseries5
{
    public static void main(String args[])
    {
        double i,n,t,d,s,x;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the number");
        s=0;
        n=jj.nextInt();
        for(i=1;i<=n;i++)
        {
            d=1;
            for(x=1;x<=i;x++)
            {
                d=d*x;
            }
            t=i/d;
            t=(Math.pow(i,i))/d;
            s=s+t;
        }
        System.out.println(s);
    }
}