import java.util.*;
class Permutation
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a,k,i,t=0;
        a=sc.nextInt();
        System.out.println("Enter the key:");
        k=sc.nextInt();
        String a1,k1;
        a1=Integer.toString(a);
        k1=Integer.toString(k);
        if(a1.length()==k1.length())
        {
          for( i=1;i<=a1.length();i++)
          {
            if(k1.indexOf(i)!=-1)
                t=0;
            else t=1;
          }
        }
        if(t==1)
        {
            char a2[]=new char [a1.length()];
            int k2[]= new int[a1.length()];
            for(i=0;i<a1.length();i++)
            {
              int j=(a1.length()-1);
              k2[i]=k/(int)(Math.pow(10,j));
              j--;
            }
            
            char b2[]=new char [a1.length()];
            for(i=0;i<a1.length();i++)
            a2[i]=a1.charAt(i);
            
            for(i=0;i<a1.length();i++)
            b2[k2[i]-1]=a2[i];
            System.out.println("The encrypted number is : ");
            for(i=0;i<a1.length();i++)
           System.out.print(b2[i]);

    }
    else System.out.println("INVALID INPUT !!!");
}
}