public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try{
            int result = divide(10,0);
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("error");
        }finally{
            System.out.println("finally block");
        }

        System.out.println("program continuos after exception handling");
    }
}

public static int divide(int a, int b) throws ArithmeticException
{
    return a/b;
}

//TASK for Null Pointer Exception
//String str = NULL;
//in try method check the length og the str
//it will go to catch method, there use the null pointer expection 