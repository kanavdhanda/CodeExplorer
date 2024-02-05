import java.util.Scanner;
class pattern3
{
     public static void main(String args[]) 
    {
        int sp,n,c,r;
        Scanner jj =new Scanner(System.in);
        System.out.println("How many rows you want"); 
        n=jj.nextInt();
        for ( r=1; r<=n; r++) 
        {
            for(sp=n;sp>=r;sp--)
            {
                System.out.print(" ");
            } 
            for (c=1;c<=r;c++) 
            { 
                System.out.print(c); 
            }
            for (c=r-1;c>=1;c--)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}



/*
 *   1
    121
   12321
  1234321
 123454321
 */
         