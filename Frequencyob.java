import java.util.*;
class Frequencyob
{
    int mat[][];
    int m;
    int n;
    Frequencyob(int mm,int nn)
    {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }
    void readArray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
        mat[i][j]=sc.nextInt();

    }

    /*for(i=0;i<arr.length;i++)
        fr[arr[i]]++; */
    boolean compare(Frequencyob A, Frequencyob B)
    {
        int i,j;
        int sumA=0,sumB=0;
        int[] frq1=new int[10];
        int[] frq2=new int[10];
       for(i=0;i<m;i++)
        {
        for(j=0;j<n;j++)
        {
          frq1[A.mat[i][j]]++;
        }
       
        } 
     for(i=0;i<m;i++)
        {
        for(j=0;j<n;j++)
        {
          frq2[B.mat[i][j]]++;
        }
       
        } 
        for(i=0;i<10;i++)
        {
            System.out.print(frq1[i]);
            System.out.println();
            System.out.println(frq2[i]);
}

         for(i=0;i<10;i++)
         {
            if(frq1[i]!=frq2[i])
                return false;
         }
         return true;
    }
    void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

     int m,n;
     System.out.println("Enter number of rows"+4);
     m=sc.nextInt();
     System.out.println("Enter number of columns:");
     n= sc.nextInt();
     Frequencyob A= new Frequencyob(m,n);
     Frequencyob B= new Frequencyob(m,n);
     System.out.println("Enter eelements for Matrix A");
     A.readArray();
     System.out.println("Enter eelements for Matrix B");
     B.readArray();
     System.out.println("\n Matrix A:");
    A.print();
     System.out.println("\n Matrix B:");
    B.print();
     if(A.compare(A,B))
        System.out.println("\n The sum of Boundary elements is equal");
    else
        System.out.println("\n The sum of Boundary elements is NOT equal");
    
    }
}