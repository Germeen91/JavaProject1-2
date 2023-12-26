package JavaProject;

public class Task10 {
    public static void main(String[] args) {
/*10.Write a program to print out duplicate elements from an Array of Strings?
 */

        String []name={"gege","beshoy","Steven","Marcellino","Steven","gege","beshoy"};


        for (int i=0; i<name.length-1;i++){
            for (int j=i+1;j<name.length;j++) {
                if (name[i].equalsIgnoreCase(name[j]) && (i != j)) {
                    System.out.println(name[i] + " duplicate name");
                }

            }
        }









        String[] myarray = {"bosh", "sino", "sevo", "bosh", "sino", "gege", "koko","sevo"};

        // Iterate through the elements of the string array.
        
        for (int i = 0; i < myarray.length-1; i++) {
            for (int j = i + 1; j < myarray.length; j++) {
                // Check if two string elements are equal and not the same element.
                if ((myarray[i].equals(myarray[j])) && (i != j)) {
                    // If a duplicate is found, print the duplicate element.
                    System.out.println("Duplicate Element is : " + myarray[i]);
                }


            }
        }





    }}
