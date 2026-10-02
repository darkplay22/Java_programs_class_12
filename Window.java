import java.util.*;
public class Window
 {
    boolean character (String a,String b) //a=string ,,, b= "abc";
    {
      char c1,c2;
      int i,j,k=0;
      for(i=0;i<b.length();i++)
      {
        k=0;
        c1=b.charAt(i);
        for(j=0;j<a.length();j++)
        {
            c2=a.charAt(j);
            if( c1==c2)
                k=1;
        }
        if(k==0)
            return false;
      }
      return true;
    }
    public static void main(String[] args)
     {
        Window ob = new Window();
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String a,b="",c;
a=sc.nextLine();
System.out.println("Enter another shortest string:");
c=sc.next();
int i,p,j,k=0;
String l[]=new String[1000];
p= a.length();
for(i=0;i<p;i++)
{
    for(j=i+1;j<=p;j++)
{
    
    b=a.substring(i,j);
    if( ob.character(b,c)==true)
    {
      l[k]=b;
      k++;
    }
}
}
for(i=0;i<k;i++)
    System.out.print( l[i]+"  ");
String t="";
for(i=0;i<k;i++)
{
for(j=i+1;j<k;j++)
{
    if(l[i].length()>l[j].length())
    {
        t=l[i];
        l[i]=l[j];
        l[j]=t;
    }
}
}
System.out.println(" The shortest window substring is : "+l[0]);
 }
    
}
