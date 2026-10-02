import java.util.*;
class Shift_matrix
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a[][]={{100,90,87,76},{200,500,167,998},{77,567,89,254}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
        System.out.println();
        int i,r,c,m=3,n=4;
        r=0;

       /*  for(i=0;i<3;i++)
        {
            if(i>0 && i<2)
                r=2;
            else if(i==0)
                r=1;
            else 
                r=0;
            for(int j=0;j<4;j++)
                System.out.print(a[r][j]+"  ");
            System.out.println();
        }*/
c=m-2;
             for(i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[c][j]+"  ");
                
            }
            c++;
            if(c==m)
            c=0;
            System.out.println();
        }
    }


}