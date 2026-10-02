import java.util.*;
class String_common
{
static String ischeck(String st)
{
    String s="";
    boolean flag=false;
    for(int i=0;i<st.length();i++)
    {
        flag=false;
        for(int j=i+1;j<st.length();j++)
        {
            if(st.charAt(i)==st.charAt(j))
            {
                flag=true;
                break;
            }
        }
        if(!flag)
            s=s+st.charAt(i);
    }
    return s;
}
    public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter two words , one by one :");
String a1,a2,s1="",s2="",s3="";
a1=sc.next();
a2=sc.next();
int i,j,p1,p2;
p1=a1.length();
p2=a2.length();
s1=ischeck(a1);
s2=ischeck(a2);
for(i=0;i<s1.length();i++)
{
    char c=s1.charAt(i);
    if((s2.indexOf(c)!=-1))
        s3=s3+c;
}
System.out.println(s3);
}
}
