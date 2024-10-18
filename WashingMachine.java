public class WashingMachine extends Appliance{
    int loadCapacity;

    public WashingMachine(String Brand, int loadCapacity)
    {
        super(Brand);
        this.loadCapacity = loadCapacity;
    }

    public void displayLoadCapacity()
    {
        System.out.println(loadCapacity);
    }

    public void turnOn()
    {
        System.out.println("Washing Machine is ON");
    }
}
