package Classdemo;

public class ClassesObjectDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Haval", "Black", 100);
//        car1.brand= "Haval";
//        car1.color="Black";
//        car1.speed=100;

        car1.drive();

        Car car2 = new Car("Charry", "Black", 80);
        car2.drive();
    }


}
