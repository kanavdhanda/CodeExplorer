import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the no.");
        n=jj.nextInt();
        i=1;
        while(i<=10)
        {
            j=i*n;
            System.out.println(n+"*"+i+"="+j);
            i++;
        }
    }
}