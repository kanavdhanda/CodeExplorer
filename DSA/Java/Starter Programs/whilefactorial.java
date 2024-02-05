import java.util.Scanner;
class whilefactorial
{
    public static void main(String args[]) 
    {
        int i,f,n;
        Scanner jj=new Scanner(System.in);
        n=jj.nextInt();
        f=1;
        i=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println(f);
    }
}