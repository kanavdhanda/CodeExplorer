import java.util.Scanner;
class pattern4
{
     public static void main(String args[]) 
    {
        int sp,n,c,r;
        Scanner jj =new Scanner(System.in);
        System.out.println("How many rows you want"); 
        n=jj.nextInt();
        for (r=1;r<=n;r++) 
        {
            for(sp=n;sp>=r;sp--)
            {
                System.out.print(" ");
            } 
            for (c=1;c<=r;c++) 
            { 
                System.out.print(c); 
            }
            System.out.println();
        }
    }
}
         


/*
     1
    12
   123
  1234
 12345
 */