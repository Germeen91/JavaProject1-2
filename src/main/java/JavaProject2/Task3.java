package JavaProject2;
/*3. Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".
*/
public class Task3 {
    public static void main(String[] args) {

        StringBuilder str1=new StringBuilder("Hello");
        System.out.println(str1.reverse());

        //////////////////////////
        String str="Hello";

        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
           reverse=reverse+ str.charAt(i);
        }
        System.out.println(reverse);
    }

}
