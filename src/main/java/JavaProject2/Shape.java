package JavaProject2;
/*Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.
*/
public interface Shape {

    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("A=πr2");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("C=2πr");
    }
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("A=a2");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("P=4a");
    }
}
class Tester{
    public static void main(String[] args) {

        Shape []array={new Circle(), new Square()};

        for (Shape s:array){
            s.calculateArea();
            s.calculatePerimeter();

        }

    }
}