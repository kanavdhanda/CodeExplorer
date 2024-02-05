import java.util.Scanner;
class factors
{
public static void main(String args[])
{
    int n,i;
    Scanner jj=new Scanner(System.in);
    n=jj.nextInt();
    i=1;
    while(i<=n)
    {
        if(n%i==0)
        {
            System.out.println(i);
        }
        i++;
    }
}
}

