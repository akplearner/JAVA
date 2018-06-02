import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class 
public class FileInputDemo{
    //where is the throw clause??
    public static void main(String[] args) throw clause{
        Scanner reader = null;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter file name");
        String fileName = kb.nextLine();
        try{
            reader = new Scanner(new File(fileName));

        }
        catch(FileNotFoundException e){
            System.out.println("Error File not found.");
            System.exit(0);
        }
        catch(EXCEPT e1){
            System.out.println("bad");
        }
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
        kb.close();
    }


}