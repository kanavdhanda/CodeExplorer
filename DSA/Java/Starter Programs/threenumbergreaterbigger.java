import java.util.Scanner;
class threenumbergreaterbigger
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Please enter the first number");
        a=obj1.nextInt();
        System.out.println("Please enter the second number");
        b=obj1.nextInt();
        System.out.println("Please enter the third Number");
        c=obj1.nextInt();
        if(a>b)
        {
            if(a>c)
            {
            System.out.println(a);
            System.out.println("Is bigger");
        }
        else
        {
            System.out.print(c);
            System.out.println(" is bigger");
        }
    }
        else
        {
            if(b>c)
            {
                System.out.print(b);
                System.out.print(" is bigger");
            }
            else
            {
                System.out.print(c);
                System.out.print(" is bigger");
            }
        }
    }
}