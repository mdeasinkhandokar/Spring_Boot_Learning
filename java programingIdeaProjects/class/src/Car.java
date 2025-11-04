public class Car {

    private String  doors;
    private String engine;
    private String driver;
    private int speeds;



    public Car(){
        doors="Closed";
        engine="on";
        driver="seated";
        speeds=14;
    }


public Car( String doors, String engine, String seated, int speeds){
    this.doors=doors;
    this.engine=engine;
    this.driver=driver;
    this.speeds=speeds;
}






public void setDoors(String doors){
     this.doors=doors;
}

public void setEngine(String engine){
    this.engine=engine;
}
public void setDriver (String driver){
    this.driver=driver;
}
public void setSpeeds(int speeds){
    this.speeds=speeds;
}


public String  getDoors(){
    return doors;
}
public String getEngine(){
    return engine;
}
public String getDriver(){
    return driver;

}
public int getSpeeds(){
    return speeds;
}

/// method run
    public String run(){
        if(doors.equals("Closed") && engine.equals("on") && driver.equals("seated") && speeds>0){
            return "running";
        }else{
            return "not running";
        }
    }








}
