import java.util.*;
class Array_2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,n=5,i,j;
        System.out.println("Enter the number of digits to be entered");
        n=sc.nextInt();
        System.out.println("Enter the digits of the array one by one");
        int a1[]=new int[n];
        for(i=0;i<n;i++)
        a1[i]=sc.nextInt();
        int a2[]= new int[n];
        int a3[]= new int[n];
        boolean flag=false;
        int k=0,p=0;
        for(i=0;i<n;i++)
        {
            if(a1[i]==0)
            {
             a3[p]=a1[i];
            p++;
            }
            else
        {
            flag=false;
            for(j=i+1;j<n;j++)
            {
                if(a1[i]==a1[j])
                {
                    flag=true;
                    break;
                }
            }
               
            if(!flag)
            {
            a2[k]=a1[i];
            k++;
                
            }
        }
        }
        int o=0;
        for(i=0;i<n;i++)
        {
            a1[i]=a2[i];
        }
        for(j=i;j<n;j++)
        {
            a1[j]=a3[o];
            o++;
        }
        System.out.println("The weirdly arranged array is :");
        for(i=0;i<n;i++)
            System.out.print(a1[i]+"\t");
    }
}