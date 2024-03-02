package JavaProject2;

import java.util.ArrayList;

/*You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".*/
public class Task8 {
    public static void main(String[] args) {

        ArrayList <String> names= new ArrayList<>();
        names.add("Armia");
        names.add("Amir");
        names.add("Germeen");
        names.add("Steven");

        for (int i=0; i<names.size(); i++){
            if (names.get(i).startsWith("A")){
                System.out.println(names.get(i).toLowerCase());
            }
        }
        ///////////////////////////////////////////////////////
        names.forEach(x->{
            if (x.startsWith("A")){
                System.out.println(x.toLowerCase());
            }
        });


    }
}
