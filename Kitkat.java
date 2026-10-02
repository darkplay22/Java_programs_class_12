import java.util.*;

class Kitkat
{
    String palindrome(String a)
    {
        String b="",c="";
        int p,i;
        p=a.length();
        String e="";

        for(i=0;i<p;i++)
        {
            b=a.charAt(i)+b;
        }

        if(a.compareTo(b)==0)
            return a;
        else
        {
            // Check for repeated alphabets at the end
            int j=p-1;

            while(j>0 && a.charAt(j)==a.charAt(j-1))
            {
                j--;
            }

            if(j<p-1)
            {
                e=a.substring(0,j+1);
                String d=e;

                for(i=0;i<e.length();i++)
                {
                    d=e.charAt(i)+d;
                }

                c=e+d.substring(e.length());
            }
            else
            {
                e=b.substring(1);
                c=a+e;
            }

            return c;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2="";
        Kitkat ob = new Kitkat();
        int i,x=0;

        System.out.println("Enter a sentence:");
        s1=sc.nextLine();

        int p=s1.length()-1;
        char ch=s1.charAt(p);

        if(ch=='.' || ch=='?' || ch=='!')
        {
            s1=s1.substring(0,p);

            StringTokenizer ox = new StringTokenizer(s1);

            while(ox.hasMoreTokens())
            {
                String g=ob.palindrome(ox.nextToken());
                s2=s2+" "+g;
            }

            System.out.println("Original sentence:");
            System.out.println(s1+ch);

            System.out.println("Converted sentence:");
            System.out.println(s2.trim()+ch);

            System.out.println("PROGRAM IS TERMINATED");
        }
        else
            System.out.println("Invalid");
    }
}
