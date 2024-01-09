package JavaProject2;

import org.checkerframework.checker.units.qual.C;

/*Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount*/
public class Car {
     private double carPrice;
     private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double getCarPrice(){ // we have to create get method to allows you to retrieve the value of private Attribute outside the class
        return carPrice;
    }
    public double calculateSalePrice() {
        return carPrice;
    }
    public void print(){
        System.out.println(carPrice+" "+color);
    }

}

    class Sedan extends Car {
         private double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }



        public double calculateSalePrice() {
            if (length > 20) {
                return (getCarPrice() - (getCarPrice() * 0.05));
            } else {
                return (getCarPrice() - (getCarPrice() * 0.1));
            }
        }

        @Override
        public void print() {
            super.print();
            System.out.println(length);
        }
    }

    class Truck extends Car {
         private double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }



        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                return (getCarPrice() - (getCarPrice() * 0.1));
            } else {
                return (getCarPrice() - (getCarPrice() * 0.2));
            }
        }

        @Override
        public void print() {
            super.print();
            System.out.println(weight);
        }
    }
    class CarTester{
        public static void main(String[] args) {

            Car []array={new Sedan(100,"Black",30),
            new Truck(200,"Blue",1000)};

            for (Car c:array){
                c.print();

                System.out.println(c.calculateSalePrice());
            }


        }
    }


