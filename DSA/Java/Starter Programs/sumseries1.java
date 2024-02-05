import java.util.Scanner;
class sumseries1
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
            s=s+(Math.pow(i,2));
        }
        System.out.println(s);
    }
}

// for number 6 result will be 1^2 + 2^2 + 3^2 +4^2 +5 ^2 + 6^2 = 91.0