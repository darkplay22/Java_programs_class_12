import java.util.*;
public class String_mixer
{
    public static void main(String args[])
    {
        String a,s2="";
        int i,p,s=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the wrd");
       
        a=sc.next();
        a=a+" ";
        p=a.length();
        for(i=0;i<p-1;i++)
        {
            char ch= a.charAt(i);
            char ch1=a.charAt(i+1);
                if(ch1==ch)
                {
                    s++;
                }
                else
                {
                s2=s2+ch+Integer.toString(s);
                s=1;
                }
            }
            
        System.out.println(s2);
    
    }
}
