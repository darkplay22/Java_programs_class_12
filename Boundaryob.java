import java.util.*;
class Boundaryob
{
    int mat[][];
    int m;
    int n;
    Boundaryob(int mm,int nn)
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
    boolean compare(Boundaryob A, Boundaryob B)
    {
        int i,j;
        int sumA=0,sumB=0;
       for(i=0;i<m;i++)
        {
        for(j=0;j<n;j++)
        {
          if(i==0 || j==0 || i==m-1 || j== n-1 )
          {
            sumA = sumA+ A.mat[i][j];
            sumB=sumB+B.mat[i][j];
          }
        }
       
        } 
         if(sumA!=sumB)
            return false;
        else 
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
     Boundaryob A= new Boundaryob(m,n);
     Boundaryob B= new Boundaryob(m,n);
     System.out.println("Enter eelements for Matrix A");
     A.readArray();
     System.out.println("Enter eelements for Matrix B");
     B.readArray();
     if(A.compare(A,B))
        System.out.println("\n The sum of Boundary elements is equal");
    else
        System.out.println("\n The sum of Boundary elements is NOT equal");
    System.out.println("\n Matrix A:");
    A.print();
     System.out.println("\n Matrix B:");
    B.print();
    }
}