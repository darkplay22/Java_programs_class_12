import java.util.*;
class Powerful_No
{
    boolean power( int c)
    {
        double s=0; int a=c;
       while ( a>0)
       {
        double d=a%10;
        s=s+ Math.pow(d,d);
        a=a/10;
       }
       if(s==c)
        return true;
    else 
        return false;
    }
    public static void main(String args[])
    {
        Powerful_No ob = new Powerful_No ();
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower limit :");
        int n= sc.nextInt();
        System.out.println("Enter the upper limit :");
        int m= sc.nextInt();
        int i,j;
        for(i=n;i<=m;i++)
        {
            boolean k= ob.power(i);
            if(k==true)
                System.out.println(i);
        }
    }
}