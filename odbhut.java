import java.util.*;
class odbhut
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        String a,b,c;
        int n,p=0,s=0;
        n=sc.nextInt();
        int i,j;
        int k[]= new int[n];
        sc.nextLine();
        System.out.println("Enter n no of lines with n no. of digits separated by a space.");
        String s1[]= new String[n];
        for(i=0;i<n;i++)
        { 
    
            s1[i]=sc.nextLine();
            
        }
        for(i=0;i<n;i++)
        { 
            s=0;
            StringTokenizer ob= new StringTokenizer(s1[i]," ");
            while(ob.hasMoreTokens())
            {
                s=Integer.valueOf(ob.nextToken())+s;
            }
            k[p]=s;
            p++;
        }
        int t=0;
        String h="";
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(k[i]>k[j])
                {
                    t=k[i];
                    h=s1[i];
                    k[i]=k[j];
                    s1[i]=s1[j];
                    k[j]=t;
                    s1[j]=h;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(s1[i] + "\t"+k[i]);
        }


    }
}