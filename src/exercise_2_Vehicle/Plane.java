package exercise_2_Vehicle;

public class Plane extends Vehicle{
    int altitude;
    int countOfPassengers;

    public Plane(int price, double speed, int yearOfBuild, int altitude, int countOfPassengers) {
        super(price, speed, yearOfBuild);
        this.altitude = altitude;
        this.countOfPassengers = countOfPassengers;
    }
}
