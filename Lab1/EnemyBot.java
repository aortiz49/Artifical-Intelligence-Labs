package ao;
import robocode.*;
import java.awt.Color;
import java.io.IOException;

public class EnemyBot {
    private String name;
    private double bearing;
    private double distance; 
    private double energy; 
    private double heading;
    private double velocity;

    public void EnemyBot(){
        reset();
    }


    public void reset() {
        name = "";
        bearing = 0;
        distance = 0;
        energy = 0;
        heading = 0;
        velocity = 0;

    }

    public void update(ScannedRobotEvent e){

        this.name = e.getName();
        this.bearing = e.getBearing();
        this.distance = e.getDistance();
        this.energy = e.getEnergy();
        this.heading = e.getHeading();
        this.velocity = e.getVelocity();

    }

    public String getName(){
        return name;
    }

    public double getBearing(){
        return bearing;
    }

    public double getDistance(){
        return distance;
    }

    public double getEnergy(){
        return energy;
    }

    public double getHeading() {
        return heading;
    }

    public double getVelocity(){
        return velocity;
    }

    public boolean none() {
        return name.equals("");
    }


}