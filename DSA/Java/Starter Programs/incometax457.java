import java.util.Scanner;
class incometax457
{
    public static void main(String args[])
    {
        double income,tax;
        Scanner jj=new Scanner(System.in);
        income=jj.nextInt();
        if(income<=250000)
        {
            System.out.println("You need to pay Rs0 as tax");
        }
        else
        {
            if(income>=250001&&income<=500000)
            {
                tax=250000*0+(income-250000)*10/100;
                System.out.print("You need to pay Rs"+tax);
                System.out.println("as tax");
            }
            else
            {
                if(income>=500001&&income<=1000000)
                {
                    tax=250000*0+250000*10/100+(income-500000)*15/100;
                    System.out.print("You need to pay Rs"+tax);
                    System.out.println("as the tax");
                }
                else
                {
                    if(income>=1000000&&income<=1500000)
                    {
                        tax=250000*0+250000*10/100+500000*15/100+(income-1000000)*20/100;
                        System.out.println("You need to pay Rs"+tax);
                    }
                    else
                    {
                        tax=250000*0+250000*10/100+500000*15/100+500000*20/100+(income-1500000)*25/100;
                    }
                }
            }
        }
    }
}