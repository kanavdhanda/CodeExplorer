import java.util.Scanner;
class sumseries
{
    public static void main(String args[])
    {
        double i,n,t,d,s;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the number");
        s=0;
        n=jj.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println(s);
    }
}