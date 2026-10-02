import java.util.StringTokenizer;

class TokenizerDemo
{
    public static void main(String args[])
    {
        String str = "He is a very very good boy, isn't he?";

         StringTokenizer st =
            new StringTokenizer(str, " !,?._'@");
        int count = st.countTokens();
        System.out.println(count);

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}