import java.util.*;
class Array_1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,n=5,i,j;
       //System.out.println("Enter the number of digits to be entered");
        //n=sc.nextInt();
        //System.out.println("Enter the digits of the array one by one");
       // int a1[]=new int[n];
        //for(i=0;i<n;i++)
          //  a1[i]=sc.nextInt();
         int a1[]={12,11,-2,15,-3};
         int a2[]= new int[5];
         int a3[]=new int[5];
         int k=0,p=0;
         for(i=0;i<5;i++)
         {
            if(a1[i]>0)
                {
                    a2[k]=a1[i];
                    k++;
                }
            else
            {
                a3[p]=a1[i];
                p++;
            }
         }
         k=0;p=0;
         for(i=0;i<5;i++)
         {
           if(i%2==0)
           {
            a1[i]=a2[k];
            k++;
           }
        else
        {
            a1[i]=a3[p];
            p++;
        }
         }
         System.out.println("The weirdly arranged array is");
         for(i=0;i<5;i++)
            System.out.print( a1[i]+"\t");

    }
}