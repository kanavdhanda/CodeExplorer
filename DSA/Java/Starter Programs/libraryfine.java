import java.util.Scanner;
class libraryfine
{
   public static void main(String args[])
    {
        int dlbs,fine;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Please enter the no.of days later the book was submitted late");
        dlbs=obj1.nextInt();
        if (dlbs==0)
        {
            System.out.println("You need to pay ₹0");
        }
        else
        {
            if(dlbs>=1&&dlbs<=5)
            {
                fine=dlbs*2;
                System.out.println("You need to pay ₹"+fine);
            }
            else
            {
                if(dlbs>=6&&dlbs<=10)
                {
                    fine=dlbs*10;
                    System.out.println("You need to pay ₹"+fine);
                }
                else
                {
                    if(dlbs>10)
                    {
                        fine=dlbs*50;
                        System.out.println("You need to pay ₹"+fine);
                    }
                }
            }
        }
    }
}