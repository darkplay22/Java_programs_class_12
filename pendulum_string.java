import java.util.*;

class pendulum_string {

    String lowest(String a, int j) {
        String b = "";

        while (a.length() > 0) {
            int min = 200;
            int pos = 0;

            
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c < min) {
                    min = c;
                    pos = i;
                }
            }

           
            a = a.substring(0, pos) + a.substring(pos + 1);

            
            if (j % 2 == 0)
                b = b + (char) min; 
            else
                b = (char) min + b; 

            j++;
        }

        return b;
    }

    public static void main(String args[]) {
        pendulum_string ob = new pendulum_string();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s1 = sc.next();

        String s2 = ob.lowest(s1, 1);

        System.out.println("The pendulum string is: " + s2);
    }
}