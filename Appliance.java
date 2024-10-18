public class Appliance {

    String Brand;

    public Appliance(String Brand)
    {
        this.Brand = Brand;
    }
    
    public void displayBrand(){
        System.out.println(Brand);
    }

    public void turnOn()
    {
        System.out.println("ON");
    }
}
