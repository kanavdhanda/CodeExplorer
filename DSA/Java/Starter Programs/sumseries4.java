import java.util.Scanner;
class sumseries4
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
            if(i%2==0)
            {
                s=s-t;
            }
            else
            {
                s=s+t;
            }
        }
        System.out.println(s);
    }
}