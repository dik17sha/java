class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //Creating getter function
    //have to use get keyword
    public String getName(){
        return name;
    }

    //Creating setter function
    //have to use set keyword
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age>0){
            this.age = age;
        }

    else{
        System.out.println("Enter a Valid age");
    }
        
    }
}

public class PersonMain {
    public static void main(String[] args)
    {
        Person person = new Person("abc",40);

        //Printing the name
        System.out.println(person.getName());

        //Printing the age
        System.out.println(person.getAge());

        //Update the age
        person.setAge(50);
        System.out.println(person.getAge());

        person.setAge(-6);

    }
    
}
