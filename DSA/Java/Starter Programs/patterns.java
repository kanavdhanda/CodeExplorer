import java.util.Scanner;
class patterns
{
    public static void main(String args[])
    {
        int n,c,r;
        Scanner jj=new Scanner(System.in);
        System.out.println("Enter The number of rows: ");
        n=jj.nextInt();
        for(r=1;r<=n;r++)
        {
            
            for(c=1;c<=r;c++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
                

/*
$
$$
$$$
$$$$
$$$$$ */