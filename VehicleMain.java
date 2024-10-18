abstract class vehicle{
    public abstract void startEngine();

    public void stopEngine()
    {
        System.out.println("Engine is turned off!");
    }
}

//extends keywords: 
class Car extends vehicle
{
    public void startEngine()
    {
        System.out.println("car engine is starting with a key");
    }

}

class Bike extends vehicle
{
    public void startEngine()
    {
        System.out.println("starting with a button");
    }
}


public class VehicleMain {
    public static void main(String[] args) {
        vehicle myCar = new Car();
        vehicle myBike = new Bike();

        myCar.startEngine();
        myCar.stopEngine();

        myBike.startEngine();
        myBike.stopEngine();
    }
    
}
