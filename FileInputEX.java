import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEX {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try{
            inputStream = new FileInputStream("input.txt");

            outputStream = new FileOutputStream("output.txt");

            int byteData;

            //Reading data from input and wrting to output

            while((byteData = inputStream.read()) != -1){
                outputStream.write(byteData);
            }

            System.out.println("Data copied from input to output successfully");

        
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("Fine");
        }

    }
}