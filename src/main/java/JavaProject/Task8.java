package JavaProject;

public class Task8 {
    public static void main(String[] args) {

/*8. Maximum and minimum number in the array?
 */
        int []num={2,19,4,32,5};


int min=num[0];
int max=num[0];

for (int i=0; i< num.length; i++){

    if (num[i]<min){
       min=num[i];
    }

    if (num[i]>max){
        max=num[i];
    }
}
        System.out.println(min+" maximum number");
        System.out.println(max+" minimum number");


    }
}
