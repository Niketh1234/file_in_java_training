import java.io.*;
import java.util.*;
public class FileReader{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("NamingConventions.txt");
            byte[] data = new byte[fis.available()]; // reading data and converted into byte array
            fis.read(data);
            System.out.println(new String(data));
        }
        catch(Exception e){
            System.out.println("This is the exception");
        }
        finally{
            Optional<FileInputStream> of = Optional.ofNullable(fis); // another way of handling null pointer exception
            if(of.isPresent())
                fis.close();
        }
    }
}