package JavaProject2;

/*1. Write a program to swap 2 String without a temporary variable?*/
public class Task1 {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="Java";


        System.out.println(s1);
        System.out.println(s2);

String New1=s1.replaceAll(s1,s2);
String New2=s2.replaceAll(s2,s1);

        System.out.println(New1);
        System.out.println(New2);

        System.out.println("......................");

        System.out.println(s1);
        System.out.println(s2);
        s1=s1+s2;

        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,5));
    }
}
