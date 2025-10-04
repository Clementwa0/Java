import java.io.File;
import java.io.IOException;
/*
    The File class lets you work with file names and properties,
    but not directly read or write text.

 **/
public class Files {
    public static void main (String[] args){

        try {
            File file = new File("myfile.txt");
            if (file.createNewFile()) {
                System.out.println("File created:" + file.getName());
            }else{
                System.out.println("File already exists");
            }
            if(file.exists()){
                System.out.println("File name: " + file.getName());
                System.out.println("Path: " + file.getAbsolutePath());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Readable: " + file.canRead());
                System.out.println("File size: " + file.length() + " bytes");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
