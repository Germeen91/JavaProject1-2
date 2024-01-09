package JavaProject2;
/*2. Find out how many alpha characters are present in a string?
 */
public class Task2 {
    public static void main(String[] args) {

        String str="Hello Batch 18";
        String s=str.replaceAll("[^A-Za-z]","");
        System.out.println(s.length());
    }
}
