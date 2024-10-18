import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEX {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;

        try{
            outputStream = new FileOutputStream("outputs.txt");
            String data = "this is an example of writing data to a file";

            outputStream.write(data.getBytes());

            System.out.println("completed");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("done");
        }
    }
}
