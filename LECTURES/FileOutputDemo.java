import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOutputDemo{
    public static void main(String [] args)throws clause{
        Scanner kb = new Scanner(System.in);
        File output = new File("/Users/tony/akplearn/College coursework/csc212/Code/Lectures/data.txt");
        printWriter printer = null;
        try{
            printer =new printWriter(output);
        }
    }
}