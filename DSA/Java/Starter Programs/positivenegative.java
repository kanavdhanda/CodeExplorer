import java.util.Scanner;
class positivenegative
{
    public static void main(String args[])
    {
    int n;
    Scanner kanav=new Scanner(System.in);
    System.out.println("Please Enter the number");
    n=kanav.nextInt();
    if( n>=0)
    {
        System.out.println("Positive");
    }
    else
    {
        System.out.println("Negative");
    }
}
}