package JavaProject2;
/*6. Create a method to count how many vowels are present in a string
“documentation”
*/
public class Task6 {
    public static void main(String[] args) {

        String str="documentation";
        String vowels=str.replaceAll("[^AaUuIiOoEe]","");
        System.out.println(vowels.length());
/////////////////////////////////////
        System.out.println(str.replaceAll("[^AaUuIiOoEe]","").length());
    }
}
