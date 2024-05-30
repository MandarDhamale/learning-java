package corejava.classes;

public class Car {

    private String doors;
    private String engine = "off";
    private String driver;
    private int speed;

    public String getDoors() {
        return doors;
    }



    public Car(String doors, String engine, String driver, int speed){
        this.speed = speed;
        this.engine = engine;
        this.driver = driver;
        this.doors = doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run() {
        if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0)
            return "Running";
        else
            return "Idle";
    }



}
