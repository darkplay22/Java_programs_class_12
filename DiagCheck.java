import java.util.*;
public class DiagCheck
{
    int mat[][];
    int n;

    DiagCheck(int size)
    {
         n=size;
        mat = new int[n][n];
      
    }
    
public void readArray()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements of the matrix:");
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
mat[i][j] = sc.nextInt();
}
}
}
public void print()
{
System.out.println("Matrix:");
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
System.out.print(mat[i][j] +" ");
}
System.out.println();
}
}
public static int check(DiagCheck A)
{
    int sum=0,l=0,r=0;
for (int i = 0; i < A.n; i++)
{
l += A.mat[i][i];
r += A.mat[i][A.n-i-1];
}
sum=l+r;
return sum;
}       
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of rows: ");
int rows = sc.nextInt();


DiagCheck A = new DiagCheck(rows);
DiagCheck B = new DiagCheck(rows);

System.out.println("Enter values for Matrix A:");
A.readArray();

System.out.println("Enter values for Matrix B:");
B.readArray();

System.out.println("Matrix A:");
A.print();

System.out.println("Matrix B:");
B.print();

if (DiagCheck.check(A)==DiagCheck.check(B)) {
    System.out.println("Sum of corresponding columns is equal.");
} else {
    System.out.println("Sum of corresponding columns is not equal.");
}
}
}