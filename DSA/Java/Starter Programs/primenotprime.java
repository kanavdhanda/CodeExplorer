import java.util.Scanner;
class primenotprime
{
    public static void main(String args[])
    {
        int n,i,flag;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the number");
        n=jj.nextInt();
        i=2;
        flag=0;
        while(i<=(n-1))
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
            else
            {
                flag=1;
                i++;
            }
        }
        if(flag==0)
        {
            System.out.println("Not prime");
        }
        else
        {
        System.out.println("prime");
        }
    }
}