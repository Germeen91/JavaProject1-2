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
        char[] s1Arr=s1.toCharArray();
        char[] s2Arr=s2.toCharArray();
        Arrays.sort(s1Arr);        //Arrays. >> will give you so many methods
        Arrays.sort(s2Arr);
        System.out.println(Arrays.toString(s1Arr));
        System.out.println(Arrays.toString(s2Arr));
        //to check if arrays are equals
        System.out.println(Arrays.equals(s1Arr,s2Arr));


        }
    }