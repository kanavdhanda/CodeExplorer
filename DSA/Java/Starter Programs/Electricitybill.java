import java.util.Scanner;
class Electricitybill
{
    public static void main(String args[])
    {
        int b,u,nb,ngst;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the units consumed");
        u=jj.nextInt();
        if(u<=100)
        {
            b=u*2;
        }
        else
        {
            if(u>=101&&u<=200)
            {
                b=(100*2)+(u-100)*5;
            }
            else
            {
                if(u>=201&&u<=400)
                {
                    b=(100*2)+(100*5)+(u-200)*8;
                }
                else
                {
                    b=(100*2)+(100*5)+(200*8)+(u-400)*10;
                }
            }
        }
        b=b+500;
        nb=b+(b*12/100);
        System.out.println("You need to pay ₹"+nb);
}
}

    