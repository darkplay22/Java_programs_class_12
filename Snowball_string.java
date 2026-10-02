import java.util.*;
class Snowball_string
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String a,b;
        int p,k=0;
        
        a=sc.nextLine();
        int x= a.length();
        if(a.charAt(a.length()-1)=='.' || a.charAt(a.length()-1)=='?')
        {
            a=a.substring(0,x-1);
            int max=0;
            System.out.println(a);
        StringTokenizer st= new StringTokenizer(a);
         StringTokenizer s= new StringTokenizer(a);
        while(s.hasMoreTokens())
        {
            String wrd= s.nextToken();
            max= wrd.length()-1;
            break;
        } 
        
        System.out.println(max);
        while(st.hasMoreTokens())
        {
            String word= st.nextToken();
             p=word.length();
             System.out.println(word);
             if(p== max +1)
             {
                max=p;
                k=1;
                continue;
             }
            else
            {
                System.out.println(p+" "+max+"*"+word);

                System.out.println("Not a snowball string !!");
                break;
            }
            
        }
        if(k==1)
            System.out.println("Snowball string !");
    }
    else
        System.out.println("Invalid terminating symbol ! Invalid Input !");
        
    }
}