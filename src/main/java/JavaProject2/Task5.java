package JavaProject2;

import java.util.ArrayList;
import java.util.Arrays;

/*5. Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
*/
public class Task5 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        boolean anagrams = false;

        if (s1.length() != s2.length()) {
            System.out.println(anagrams);
        } else {

            char[] s11 = s1.toCharArray();
            char[] s22 = s2.toCharArray();

            Arrays.sort(s11);
            Arrays.sort(s22);
            anagrams=Arrays.equals(s11,s22);

        }if (anagrams==true){
            System.out.println("anagrams");
        }else {
            System.out.println("not anagrams");
        }
        }
    }