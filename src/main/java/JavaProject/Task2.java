package JavaProject;

public class Task2 {
    public static void main(String[] args) {

/*2. Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.
*/


        int []num={20,10,5,4,13,15};

        int sum=0;

        for (int i=0 ;i<num.length; i++){
            sum=sum+num[i];
        }
        System.out.println(sum);





    }
}
