import java.util.*;
class Insert
    {
     public static void main(String args[])
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a="";
        a= sc.nextLine();
        int c=0,i=0,p,t=0;
        StringTokenizer s= new StringTokenizer(a);
        String b[]= new String[s.countTokens()+1];
        while(s.hasMoreTokens())
        {
            String wrd= s.nextToken();
            b[i]=wrd;
            i++;
       }
       System.out.println("Enter another word");
       String k= sc.next();
       System.out.println("Enter position for the new word");
        p=sc.nextInt();
        for(t = b.length - 2; t >= p; t--)
        {
           b[t+1]=b[t];
        }
        b[p]=k;
        for(int j=0;j<b.length;j++)
            System.out.println(b[j]);
    }
}
    
