import java.util.*;
class movieseat
{
public static void main(String args[])
{ 
Scanner jj=new Scanner(System.in);
System.out.println("We are currently playing \n 1.Interstellar \n 2.Singham \n 3.Avengers"); 
System.out.println("Please enter the movie you want to watch");
String s=jj.nextLine();
s=s.toLowerCase();
char a='a';
int flag=0;
String seat="";
String b[]=new String[50];

if(s.equalsIgnoreCase("Interstellar")){ 
System.out.println("The available seats are");
System.out.println("============SCREEN============");

int l=0;
for(int r=1;r<=5;r++)
{
for(int c=1;c<=10;c++)
{
System.out.print(a);
System.out.print(c);
System.out.print(" ");
b[l]=String.valueOf(a);
b[l]=b[l]+ String.valueOf(c);
l++;
}
System.out.println();
a++;
}
System.out.println("Please choose the seats from above");
seat=jj.nextLine();
    }
else{
    if(s.equalsIgnoreCase("Singham")){ 

System.out.println("The available seats are");
System.out.println("============SCREEN============");
int l=0;
for(int r=1;r<=5;r++)
{
for(int c=1;c<=10;c++)
{
System.out.print(a);
System.out.print(c);
System.out.print(" ");
b[l]=String.valueOf(a);
b[l]=b[l]+ String.valueOf(c);
l++;
}
System.out.println();
a++;
}
System.out.println("Please choose the seats from above");
seat=jj.nextLine();
    }
else{
    if(s.equalsIgnoreCase("Avengers")){

 
System.out.println("The available seats are");
System.out.println("============SCREEN============");
int l=0;
for(int r=1;r<=5;r++)
{
for(int c=1;c<=10;c++)
{
System.out.print(a);
System.out.print(c);
System.out.print(" ");
b[l]=String.valueOf(a);
b[l]=b[l]+ String.valueOf(c);
l++;
}
System.out.println();
a++;
}
System.out.println("Please choose the seats from above");
seat=jj.nextLine();
    }

else{
System.out.println("We are not playing that movie please choose a different movie");}
}}

String temp="";
seat=seat+" ";
int l=seat.length();
String sd[]=new String[l];
int g=0;
int size=0;
for(int i=0;i<l;i++)
{
    char u=seat.charAt(i);
    if(u==' ')
    {
        sd[g]=temp;
        g++;
        size++;
        temp="";
    }
    else{
        temp= temp +u;
    }
}
int totalcost=0;
String gg[]=new String[size];
int hog=0;
for(int f=0;f<size;f++)
{
for(int i=0;i<50;i++)
{
    if(sd[f].equals(b[i]))
    {
        flag=1;
        gg[hog]=sd[f];
        hog++;
        continue;
    }
}}
String s3[]=new String[50];
int ho=0;
for(int i=0;i<=size;i++){
    for(int z=0;z<50;z++){
        if(sd[i]!=null){
        if(sd[i].compareTo(b[z])>0||sd[i].compareTo(b[z])<0)
        {
            flag=0;}
            break;
            }
            else{
                flag=1;
                continue;
            }
    
}
if(flag==0)
{
s3[ho]=sd[i];
ho++;
}}
int l3=s3.length;
for(int i=0;i<l3;i++)
{
    if(s3[i]!=null){
        for(int j=0;j<hog;j++){
            if(s3[i].compareTo(gg[j])>0||s3[i].compareTo(gg[j])<0){
                System.out.println("The seat "+s3[i]+" is not available");
            }
        }
    }
}    
int l2=gg.length;
  
  for(int ol=0;ol<l2;ol++){
    if(gg[ol]==null){
        continue;
    }
    else{
        System.out.println("The other seats: ");
        System.out.println( gg[ol] + " is available");
        if((gg[ol].charAt(0))=='a'||(gg[ol].charAt(0))=='b')
        {
            System.out.println("Price for this seat is: ₹200");
            totalcost=totalcost+200;
        }
        else{
            if(gg[ol].charAt(0)=='c'){
            System.out.println("Price for this seat is: ₹300");
            totalcost=totalcost+300;}
            else{
                if(gg[ol].charAt(0)=='d'){
                    System.out.println("Price for this seat is: ₹350");
                    totalcost=totalcost+350;}
                    else{
                        System.out.println("Price for this seat is: ₹400 ");
                        totalcost=totalcost+400;
                    }
                }
            }}
        }
        double costgst=totalcost+(totalcost*0.28);
System.out.println("Total price inclusive of gst: ₹"+costgst);
        
  
            jj.close();
}
}

