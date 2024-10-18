public class Arrays {
    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5};

        //To print just one elemet we can directly index
        System.out.println(numbers[0]);

        //For the full string we can use loop
        for(int i =0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        String[] names = {"abc", "cc","dd"};

        // Just to print one elemet
        System.out.println(names[0]);

        //To print entire list(instead of using a loop)
        // For efficiency 
        System.out.println(String.join(" ",names));


        // TASKS //
        // for loop and while loop


        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

        int i = 0;
        while(i < numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }
        

    }  
}
