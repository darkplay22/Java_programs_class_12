import java.util.*;
class In_place_swaps
{
      
    static void sort(int a[], int i,int j)
    {
        int t=a[i];
        a[i]=a[i+1];
        a[i+1]=t;
        
    }
      
    public static void main(String args[])
    {
        In_place_swaps ob = new In_place_swaps();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a array");
        int a[]= {4, 3, 7, 8, 6, 2, 1};
        int i,j;
        boolean flag=true;
        for(i=0;i<a.length-1;i++)
        {
            if(flag)
            {
            if(a[i]>a[i+1])
            sort(a,i,i+1);
            }
            else if(a[i]<a[i+1])
            sort(a,i,i+1);
               
            
        
        flag=!flag;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}