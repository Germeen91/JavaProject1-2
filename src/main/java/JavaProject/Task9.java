package JavaProject;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        /*9. Write a java program to find the second-largest number in the array?
         */
        int[] num = {66, 70, 67, 45, 73, 75, 65};


        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {

        System.out.print(num[i]+" ");


        }
        System.out.println();
        System.out.println( "the second largest number is "+ num[num.length-2]);
        System.out.println(num[num.length/2]);

    }

    }



