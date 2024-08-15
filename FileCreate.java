import java.io.*;
public class FileCreate{
    public static void main(String args[]) 
    {
        createFile();
    }
    public static void createFile(){
        FileOutputStream fos = null;
        try{
            File f = new File("C:\\Users\\pulkit\\Desktop\\work\\Day5\\NamingConventions.txt"); // path to the file
            // if(f.exists()){}
            // else{
                fos = new FileOutputStream(f,true);
                fos.write("Another naming convention".getBytes());// String should be converted to Byte array
                fos.close();
            // }
        }
        catch(Exception e){

        }
    }
}