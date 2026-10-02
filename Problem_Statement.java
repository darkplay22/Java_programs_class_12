import java.util.*;
class Problem_Statement 
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String");
    String s,s2="",s3="";
    s=sc.nextLine();
    s=s+" ";
    int p;
    p=s.length();
    int i;
    for(i=0;i<p;i++)
    {
      char c=s.charAt(i);
      if(c==' ')
        {
          s3="";
            s3=""+s2.charAt(0);
            int y,j;
            y=s2.length();
            for(j=1;j<y;j++)
            {
                if((int)s2.charAt(j)<(int)s2.charAt(j-1))
                    s3=s3+Character.toLowerCase(s2.charAt(j));
                else if((int)s2.charAt(j)>(int)s2.charAt(j-1))
                    s3=s3+Character.toUpperCase(s2.charAt(j));
                else
                    s3=s3+s2.charAt(j);
                
            }
            System.out.print(s3+" ");
            s2="";
        }  
        else
            s2=s2+c;
    }
  }  
}
