package JavaProject;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*6. Write a java program to check whether a given number is prime or not?
         */


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");

        int numberToCheck= sc.nextInt();
        boolean isPrime=true;

        for (int factor=2; factor<=numberToCheck/2; factor++){
            if (numberToCheck%factor==0){
                isPrime=false;
                break;
            }
        }

        if (isPrime){
            System.out.println(numberToCheck+" is prime");
        }else {
            System.out.println(numberToCheck+" is not prime");
        }






    }}
/* int num=47;
        boolean isPrime=true;
        if (num == 0 || num == 1) {

            isPrime=false;
        } else {
            for (int i = 2; i <= num / 2;i++) {
                if (num % 2 == 0) {
                 isPrime = false;

                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }*/


/*int num = 11;
        boolean isPrime=true;

        if(num<2){
            isPrime=false;
        }else{
            for(int i=2; i<=Math.sqrt(num);i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number.");
        }else {
            System.out.println(num+" is not a prime number.");
        }*/