class Car{
    String Brand;
    String Model;
    int Year;

    Car(String Brand, String Model,int Year)
    {
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
    }

    void displayInfo()
    {
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(Year);
    }

}
public class CarClass {
    
    public static void main(String[] args)
    {
        Car myCar = new Car("cc", "bb",1997);
        myCar.displayInfo();
    }
}
