import java.util.*;
class lalala
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a word with repeated letters");
      String s,s1="";
      int i,p,k=0,j;
      s=sc.next();
      p=s.length();
      for(i=0;i<p;i++)
      {
        k=0;
        char c=s.charAt(i);
        for(j=0;j<p;j++)
        {
            if(s.charAt(j)==c)
            {
                k++;
            }
            
        }
        i=i+k;
        s1=s1 +c+ Integer.toString(k);
        // System.out.println(s1);
        }
       System.out.println(s1);
    }
}