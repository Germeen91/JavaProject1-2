package JavaProject2;
/*4. Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome*/
public class Task4 {
    public static void main(String[] args) {

        String str="Madam";
        String palindrome="";

        for (int i=str.length()-1; i>=0; i--){
            palindrome=palindrome+str.charAt(i);
        }if (str.equalsIgnoreCase(palindrome)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+"Not palindrome");
        }

    }
}
