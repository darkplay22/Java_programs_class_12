import java.util.*;
class Wrd_fre
{
    int freq(String a,String b)
    {
       int i,j=0,p;
       String s4="";
       p=b.length();
       for(i=0;i<p;i++)
       {
        char ch= b.charAt(i);
         if(ch==' ')
         {
            if(s4.compareTo(a)==0)
                j++;
            s4="";
         }
        else
            s4=s4+ch;
       }
       return j;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s1,s2="",s3="";
        s1= sc.nextLine();
        s1=s1+"";
        int i,j,p,max=0;
        p=s1.length();
        Wrd_fre ob= new Wrd_fre();
        for(i=0;i<p;i++)
        {
            char c= s1.charAt(i);
            if(c==' ')
            {
              j=ob.freq(s2,s1);
              if (j> max)
              {
                max=j;
                s3=s2;
                
              }
              s2="";
            }
            else
                s2=s2+c;
        }
        System.out.println(s3);
    }
}