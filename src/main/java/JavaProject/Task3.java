package JavaProject;

public class Task3 {
    public static void main(String[] args) {


  /*3. Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers only. */



        int [][] num={
                {10,2,5,6,8,},
                {2,7,5,9,4,3}
        };

        for (int i=0; i<num.length; i++) {
            for (int p = 0; p < num[i].length; p++) {
                if ((num[i][p] % 2 == 0)) {


                    System.out.println(num[i][p]);

                }
            }
        }

        //////////////////////////////////////
        for (int [] i :num){
            for (int p :i){

                if (p % 2 ==0){

                    System.out.println(p);
                }
            }
        }


        }


    }

