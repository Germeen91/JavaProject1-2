package JavaProject2;
/*We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code*/
public abstract class Marks {
    public abstract double getPercentage();
}
class studentA extends Marks{
    private double subject1;
    private  double subject2;
    private double subject3;

    public double getSubject1(){
        return subject1;
    }
    public double getSubject2(){
        return subject2;
    }
    public double getSubject3(){
        return subject3;
    }
    public studentA(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    public double getPercentage(){
        return ((subject1+subject2+subject3)/(3*100))*100;
    }
}
class studentB extends Marks{
    private double subject1;
    private  double subject2;
    private double subject3;
    private double subject4;

    public double getSubject1(){
        return subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public double getSubject3() {
        return subject3;
    }

    public double getSubject4() {
        return subject4;
    }

    public studentB(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public double getPercentage() {
        return (((subject1+subject2+subject3+subject4)/(4*100))*100);
    }
}
class MarkTester{
    public static void main(String[] args) {
        studentA obj=new studentA(10,20,30);
        System.out.println(obj.getPercentage());

        studentB obj2=new studentB(5,15,20,20);
        System.out.println(obj2.getPercentage());
    }
}
