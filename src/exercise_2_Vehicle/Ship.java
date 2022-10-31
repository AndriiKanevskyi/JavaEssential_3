package exercise_2_Vehicle;

public class Ship extends Vehicle{
   int countOfPassengers;
   String homePort;



    public Ship(int price, double speed, int yearOfBuild, int countOfPassengers, String homePort) {
        super(price, speed, yearOfBuild);
        this.countOfPassengers = countOfPassengers;
        this.homePort = homePort;
    }
}
