import java.util.*;

import javax.lang.model.util.ElementScanner14;
class panagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String a;
        a=sc.nextLine();
        a=a.toLowerCase();
        char i;
        int c=0;
        for(i='a';i<'z';i++)
        {
          if(a.indexOf(i)<0)
          {
            c++;
            System.out.println(i);
          }
        }
        if(c==1)
            System.out.println("PANGRAMMATIC LIPOGRAM");
        else if(c==0)
            System.out.println("PANAGRAM");
        else
            System.out.println("NEITHER");
    }
}