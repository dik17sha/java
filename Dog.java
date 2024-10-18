public class Dog extends AnimalIn{

    String ownerName;

    public Dog(String name,String ownerName)
    {
        super(name);
        this.ownerName = ownerName;
    }

    public void displayOwnerName()
    {
        System.out.println(ownerName);
    }

    public void eat()
    {
        System.out.println("I am full, Bark Bark!");
    }
    
}
