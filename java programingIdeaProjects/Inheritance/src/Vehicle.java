public class Vehicle {
  private  String engine;
  private  int wheels;
  private int seats;
  private  int  fuelTank;
  private String lights;


public Vehicle(){
    engine="gass";
    wheels=4;
    seats=4;
    fuelTank=14;
    lights="YES";
}


    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public String getEngine(){
    return engine;
}
public int getWheels(){
    return wheels;
}
public int seats(){
    return seats;
}
public int getFuelTank(){
    return fuelTank;
}
public String getLights(){
    return lights;
}


public  String run(){
    return "Running vehicle";
}








    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }
}