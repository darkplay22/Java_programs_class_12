import java.util.*;
class Coding
{
    String Wrd;
 int len;
Coding()
{
    Wrd="";
    len=0;
}
void accept()
{
 Scanner sc= new Scanner (System.in);
        System.out.println("Enter a word containing alphabets lnly");
      Wrd=sc.next();
    }
    void find()
    {
        char c;
        int p,i,j,max=0,min=1000000;
        p= Wrd.length();
        for(i=0;i<p;i++)
        {
            c=Wrd.charAt(i);
            j=(int)c;
            if(j<min)
                min=j;
            if(j>max)
                max=j;
            System.out.print(c+"\t"+(int)c+"\n");
        }
        System.out.println("Lowest ascii code: "+min);
        System.out.println("Highest ascii code: "+max);
    }
    void show()
    {
    find();
    }
    public static void main(String args[])
    {
       Coding ob= new Coding();
       ob.accept();
       ob.show();

    }
}