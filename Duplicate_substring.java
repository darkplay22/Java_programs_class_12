import java.util.*;
public class Duplicate_substring
 {
    /*boolean character (String a,String b) //a=string ,,, b= "abc";
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
    }*/
    public static void main(String[] args)
     {
        Duplicate_substring ob = new Duplicate_substring();
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String a,b="",c;
a=sc.nextLine();
//System.out.println("Enter another shortest string:");
//c=sc.next();
int i,p,j,k=0;
String l[]=new String[1000];
p= a.length();
for(i=0;i<p;i++)
{
    for(j=i+1;j<=p;j++)
{
    
    b=a.substring(i,j);
      l[k]=b;
      k++;
    }
}

//for(i=0;i<k;i++)
   // System.out.print( l[i]+"  ");
String t="";
for(i=0;i<k;i++)
{
for(j=i+1;j<k;j++)
{
    if(l[i].length()<l[j].length())
    {
        t=l[i];
        l[i]=l[j];
        l[j]=t;
    }
}
}
int u=0,max=0;
String max2="";
for(i=0;i<k;i++)
{
    u=0;
    for(j=0;j<k;j++)
    {
        if(l[j].equals(l[i]))
            u++;
    }
    if(u>1)
    {
        max=u;
        max2=l[i];
        break;
}

 }
  System.out.println(" The longest duplicate substring is : "+max2);  
}
 }
