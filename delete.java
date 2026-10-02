import java.util.*;
class delete
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
    
       System.out.println("Enter position:");
        p=sc.nextInt();
        for(t = p; t<b.length-1; t++)
        {
           b[t]=b[t+1];
           
        }

        for(int j=0;j<b.length-1;j++)
            System.out.println(b[j]);
    }
}
    
