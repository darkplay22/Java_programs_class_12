import java.util.*;
class Hamming
{
    boolean prime(int h)
    {
        int i,c=0;
        for(i=1;i<=h;i++)
        {
            if(h%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Hamming ob= new Hamming();
        int a,d,n=1,k=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        int b=a;

        while(n!=b)
        {
            if(ob.prime(k)==true && k<=b)
            {
                while(a%k==0)
                {
                    if(k==2 || k==3 || k==5)
                    {
                        n = n * k;
                        a = a / k;
                    }
                    else
                    {
                        System.out.println("Not a hamming number !");
                        System.exit(0);
                    }
                }
            }
            k++;
        }
        System.out.println("It is a hamming number!");
    }
}