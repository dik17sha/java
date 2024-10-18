class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public double add(double a, double b, double c)
    {
        return a+b+c;
    }
}

public class OverloadingEx{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(2,4));
        System.out.println(calc.add(2,4,6));
        System.out.println(calc.add(2,4.7,3));

    }
}


