import java.util.Scanner;                                                                                   import java.util.Scanner;
class markscalculator
{
    public static void main(String args[])
    {
        int tm1,tm2,tm3,ms1,ms2,ms3,tot,totc,per;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Please enter the total marks of 1st subject");
        tm1=obj1.nextInt();
        System.out.println("Please enter the marks scored in 1st subject");
        ms1=obj1.nextInt();
        System.out.println("Please enter the total marks of 2nd subject");
        tm2=obj1.nextInt();
        System.out.println("Please enter the marks scored in 2nd subject");
        ms2=obj1.nextInt();
        System.out.println("Please enter the total marks of 3rd subject");
        tm3=obj1.nextInt();
        System.out.println("Please enter the marks scored in 3rd subject");
        ms3=obj1.nextInt();
        tot= tm1+tm2+tm3;
        totc=ms1+ms2+ms3;
        per=(totc/tot)*100;
        if(per>=80)
        {
            System.out.print("Distinction by scoring "+per);
            System.out.print("%");
        }
        else
        { 
            if(per>=60&&per<80)
            {
                System.out.print("1st Division by scoring"+per);
                System.out.print("%");
            }
            else
            {
                if(per>=50&&per<60)
                {
                    System.out.print("2nd division by scoring"+per);
                    System.out.print("%");
                }
                else
                {
                    System.out.print("Fail"+per);
                    System.out.print("%");
                }
            }
        }
    }
}