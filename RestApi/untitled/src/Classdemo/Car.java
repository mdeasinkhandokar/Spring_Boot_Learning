package Classdemo;

public class Car {
    public String brand;
    public String color;
    public int speed;




    public  Car(String brand, String color , int speed){
        this.brand =brand;
        this.color= color;
        this.speed= speed;

    }




    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }

}
