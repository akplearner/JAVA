import  java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TextFileInputDemo2{
    public static void main(String[] args){
        System.out.println("Enter file name:");
        Scanner kb = new Scanner(System.in); //kb scanner
        String fileName = kb.next();
        Scanner inputStream = null; //inputStreaj scanner
        System.out.println("The file"+ fileName + "\n"
                           + "contains the following lines:\n");
        try{
            inputStream = new Scanner(new File(fileName));
        }catch(FileNotFoundException e){
            System.out.println("Error opening the file" + fileName);
            System.exit(0);
        }
        while( inputStream.hasNextLine() ){
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();
    }

}