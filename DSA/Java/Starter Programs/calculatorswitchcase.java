import java.util.Scanner;
class calculatorswitchcase
{
    public static void main(String args[])
    {
        double a,b,c;
        int op;
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter The 1st number");
        a=jj.nextInt();
        System.out.println("Please enter the 2nd number");
        b=jj.nextInt();
        System.out.println("Please enter 1 to add them");
        System.out.println("Please enter 2 to subtract them");
        System.out.println("Please enter 3 to multiply them");
        System.out.println("Please enter 4 to divide them");
        op=jj.nextInt();
        switch(op)
        {
            case 1:
            c=a+b;
            System.out.println(c);
            break;
            case 2:
            c=a-b;
            System.out.println(c);
            break;
            case 3:
            c=a*b;
            System.out.println(c);
            break;
            case 4:
            c=a/b;
            System.out.println(c);
            break;
            default:
            System.out.println("error");
        }
    }
}
            