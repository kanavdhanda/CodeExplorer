import java.util.Scanner;
class pattern2
{
    public static void main(String args[])
    {
        int sp,n,c,r;
        Scanner jj=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n=jj.nextInt();
        for(r=1;r<=n;r++)
        {
            for(sp=n;sp>=r;sp--)
            {
                System.out.print(" ");
            }
            for(c=1;c<=r;c++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}


/* 
 *       $
 *      $$ 
 *     $$$
 *    $$$$
 *   $$$$$
 *  $$$$$$
 * $$$$$$$
 */
                