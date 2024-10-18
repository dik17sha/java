public class NullExceptionEx {

    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException n){
            System.out.println("Error");
        }finally{
            System.out.println("The finally block");
        }

        System.out.println("Program still continuos");
    }
    
}

//TASK for Null Pointer Exception
//String str = NULL;
//in try method check the length og the str
//it will go to catch method, there use the null pointer expection

