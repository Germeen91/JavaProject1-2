package JavaProject;

public class Task1 {
    public static void main(String[] args) {

/*1. Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
*/


        int []Temp={66,70,67,45,73,75,65};

        int highest=Temp[0];
int lowest=Temp[0];

for (int i=0 ; i< Temp.length; i++){

    if(Temp[i]>highest){
        highest=Temp[i];
    }


    if (Temp[i]<lowest){
        lowest=Temp[i];
    }

}System.out.println("The highest temperature is  "+ highest);
System.out.println("The lowest temperature is "+lowest);







}
}
