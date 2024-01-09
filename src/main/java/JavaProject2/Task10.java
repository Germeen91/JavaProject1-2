package JavaProject2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* How can you remove all duplicates from ArrayList?
 */
public class Task10 {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();
        names.add("Germeen");
        names.add("Steven");
        names.add("Feto");
        names.add("Feto");

        for (int i=0; i<names.size(); i++){
            for (int j=i+1; j<names.size(); j++){

                if (names.get(i).equalsIgnoreCase(names.get(j))){
                     names.remove(j);
                    j--;
                }
            }
        }

        System.out.println(names);

           }

}
