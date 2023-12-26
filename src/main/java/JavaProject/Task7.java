package JavaProject;

public class Task7 {
    public static void main(String[] args) {

        /*7. Write a Java Program to print the first 10 numbers of Fibonacci series.
         */


 int n=10;    int firstNum=0;     int secondNum=1;

 int nextNum;

for (int i=1;  i<=n ; i++){

    System.out.print(firstNum+" ");
    nextNum=firstNum+secondNum;
firstNum=secondNum;
secondNum=nextNum;



}
    }
}
