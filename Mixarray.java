import java.util.*;
class Mixarray{
    int arr[];
    int cap;
    Mixarray(int mm)
    {
        cap=mm;
        arr=new int[cap];
    }
    void input()
    {
        Scanner sc= new Scanner(System.in);
        int i;
        for(i=0;i<cap;i++)
            arr[i]=sc.nextInt();
    }
    public static Mixarray mix(Mixarray P, Mixarray Q) //object function
    {
        //int arr2[]=new int[6];
        Mixarray a=new Mixarray(6); //declaring object
        int i,j=0;
        for(i=0;i<3;i++)
        {
            a.arr[j++]=P.arr[i];
        }
        for(i=0;i<3;i++)
        {
            a.arr[j++]=Q.arr[i];
        }
        return a;
    }
    void display()
    {
        int i;
         System.out.println("Resultant array:  ");
        for(i=0;i<6;i++)
        {
           System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st array size:");
        int n=sc.nextInt();
        System.out.println("Enter 2nd array size:");
        int m=sc.nextInt();
        Mixarray P= new Mixarray(n);
        P.input();
        Mixarray Q=new Mixarray(m);
        Q.input();
        Mixarray a=Mixarray.mix(P, Q);
        a.display();
    }
}