import java.util.Scanner;
class forfactorial
{
    public static void main(String args[]) 
    {
        int i,f,n;
        Scanner jj=new Scanner(System.in);
        n=jj.nextInt();
        f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}