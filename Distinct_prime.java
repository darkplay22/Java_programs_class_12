import java.util.*;
class Distinct_prime
{
    boolean prime(int a)
    {
        int j,c=0;
        for(j=1;j<a;j++)
        {
          if(a%j==0)
            c++;
        }
        if(c==1)
            return true;
        else
            return false;
    }

    boolean repeat(int a)
    {
      String s=Integer.toString(a);
      String s2;
      int i,p;
      p=s.length();
      for(i=0;i<p-1;i++)
      {
        char ch=s.charAt(i);
        s2=s.substring(i+1);
        if(s2.indexOf(ch)<0)
         continue;
        else 
        return false;
      }
      return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Distinct_prime ob= new Distinct_prime();
        System.out.println("Enter lower limit:");
        int a,k=1,d, m,i,n;
        m=sc.nextInt();
        System.out.println("Enter upper limit:");
        n=sc.nextInt();
        if(m<n)
        {
            for(i=m;i<=n;i++)
            {
              a=i;
              k=1;
              while(a>0)
              {
                d=a%10;
                if(ob.prime(d)==false)
                  { 
                    k=0;
                    break;
                }
                a=a/10;
                }
                if(ob.repeat(i)==false)
                    k=0;
                if(k==1)
                    System.out.println(i);
              }
            }
        }
    }
