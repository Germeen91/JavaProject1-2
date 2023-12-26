package JavaProject;

public class Task4 {
    public static void main(String[] args) {
  /*4. Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array. */


int sumEven=0;
int sumOdd=0;

int [][]num={
        {2,19,4,32,5},
        {10,15,11,9}
};

for (int i=0; i<num.length; i++){
    for (int p=0; p<num[i].length;p++){
        if (num[i][p]%2==0){
            sumEven=sumEven+num[i][p];
        }
        if (num[i][p]%2!=0){
            sumOdd=sumOdd+num[i][p];
        }
    }

} System.out.println("Sum of even numbers : "+sumEven);
        System.out.println("Sum of odd numbers : "+sumOdd);





    }
}
