interface Animal{
    void sound();
    void sleep();
}

class Dog implements Animal{
    public void sound()
    {
        System.out.println("the dog");
    }

    public void sleep()
    {
        System.out.println("sleeping");
    }
}

class Cat implements Animal{
    public void sound()
    {
        System.out.println("the cat");
    }

    public void sleep()
    {
        System.out.println("eating");
    }
}

public class Interface {
    public static void main(String[] args)
    {
        //Here we are not using the constructor here,we are using 
        //the interface to initialize the objects
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sleep();
        myDog.sound();

        myCat.sleep();
        myCat.sound();


    }
}
