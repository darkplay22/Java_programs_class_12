import java.util.*;

class OdbhutPalindrome {

    boolean palindrome(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev.equals(s);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        OdbhutPalindrome ob = new OdbhutPalindrome();

        System.out.println("Enter a word:");
        String s = sc.next();

        char[] ch = s.toCharArray();
        int count = 0;

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (ch[i] != ch[j]) {
                ch[j] = ch[i];   // Replace one character
                count++;
            }
            i++;
            j--;
        }

        String ans = new String(ch);

        System.out.println("Palindrome word: " + ans);
        System.out.println("Minimum replacements: " + count);
    }
}